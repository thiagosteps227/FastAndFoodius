package edu.ait.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hsqldb.Session;
import org.hsqldb.Statement;



public enum UserDAO {
	
	instance;
	
	public Connection getConnection() throws Exception {
		
				
			Class.forName("org.hsqldb.jdbcDriver");
			Connection con;
			con = DriverManager.getConnection(
			"jdbc:hsqldb:hsql://localhost/oneDB", "sa", "");
			
			return con;
		  		 	     
	}
	
	public void save(User u) throws Exception {
		
		Connection c = getConnection();
	 				
		PreparedStatement psmt = c.prepareStatement
				("INSERT INTO USER (name, address, password) VALUES (?, ?, ?);");
		psmt.setString(1, u.getName());
		psmt.setString(2, u.getAddress());
		psmt.setString(3, u.getPassword());

		psmt.executeUpdate();
		
		psmt.close();
		c.close();
	 
	}

	
	public User selectOne(String address) throws Exception{
		
		Connection conn = getConnection();
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = ((java.sql.Statement) stmt).executeQuery("SELECT * FROM USER where email ='"+ address + "'");
		
		while(rs.next()) {
			if(rs.getString("address").contentEquals(address)) {
				User u = new User(rs.getString("address"),rs.getString("name"), "blank");
				return u;
			}
		}
		((Connection) stmt).close();
		conn.close();
		return null;
	}
		
	

}