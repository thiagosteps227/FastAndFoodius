package edu.ait.controller.copy;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

//Make sure that these imports correspond to the correct locations in project folder.
import edu.ait.model.CalculateOrderTotal;
import edu.ait.model.OrderDAO;

/**
 * Servlet implementation class MenuController
 */
@WebServlet("/Practise_MenuController")
public class Practise_MenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practise_MenuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// This object contains all item prices and instance variables to store quantities for each order item
		CalculateOrderTotal prices = new CalculateOrderTotal();
		
		//Below code receives quantities ordered for each item (from request) and stores quantities in instance variables of prices object
		prices.setQty_chicken_burger(Double.parseDouble(request.getParameter("item_chicken_burger")));
		prices.setQty_quarter_pounder(Double.parseDouble(request.getParameter("item_quarter_pounder")));
		prices.setQty_half_pounder(Double.parseDouble(request.getParameter("item_half_pounder")));
		
		prices.setQty_regular_chips( Double.parseDouble(request.getParameter("item_regular_chips")));
		prices.setQty_curry_chips(Double.parseDouble(request.getParameter("item_curry_chips")));
		prices.setQty_taco_chips(Double.parseDouble(request.getParameter("item_taco_chips"))); 
		
		prices.setQty_snack_box(Double.parseDouble(request.getParameter("item_snack_box"))); 
		prices.setQty_chicken_goujons(Double.parseDouble(request.getParameter("item_chicken_goujons")));
		prices.setQtychicken_nuggets(Double.parseDouble(request.getParameter("item_chicken_nuggets")));
		doGet(request, response);
		
		double total = 0;
		
		
		total = total + prices.getQty_chicken_burger() * prices.getItem_price_chicken_burger();
		total = total + prices.getQty_quarter_pounder() * prices.getItem_price_quarter_pounder();
		total = total + prices.getQty_half_pounder() * prices.getItem_price_half_pounder();
		
		total = total + prices.getQty_regular_chips() * prices.getItem_price_regular_chips();
		total = total + prices.getQty_curry_chips() * prices.getItem_price_curry_chips();
		total = total + prices.getQty_taco_chips() * prices.getItem_price_taco_chips();
		
		total = total + prices.getQty_snack_box() * prices.getItem_price_snack_box();
		total = total + prices.getQty_chicken_goujons() * prices.getItem_price_chicken_goujons();
		total = total + prices.getQtychicken_nuggets() * prices.getItem_price_chicken_nuggets();

		
		prices.setTotal(total);
		
		request.setAttribute("checkout_total", prices);
		request.getRequestDispatcher("MenuResponse.jsp").forward(request, response);
		
		String url;
		String dbname;
		String username;
		String password;

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {	
		
			//Create connection using getConnection
			con = DriverManager.getConnection(url+dbname, username, password);
			
			//Create prepared statement with variable place-holders
			String query = "INSERT INTO orders (order_id, chicken_burger, quarter_pounder, half_pounder, snack_box, chicken_goujons, chicken_nuggets, regular_chips, curry_chips, taco_chips, can_coke, can_orange, bottle_coke, bottle_water) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			stmt = con.prepareStatement(query);
			
			//Pass quantity ordered for each menu item to prepared statement
			stmt.setDouble(1, prices.getQty_chicken_burger());
			stmt.setDouble(2, prices.getQty_quarter_pounder());
			stmt.setDouble(3, prices.getQty_half_pounder());
			stmt.setDouble(4, prices.getQty_snack_box());
			stmt.setDouble(5, prices.getQty_chicken_goujons());
			stmt.setDouble(6, prices.getQtychicken_nuggets());
			stmt.setDouble(7, prices.getQty_regular_chips());
			stmt.setDouble(8, prices.getQty_curry_chips());
			stmt.setDouble(9, prices.getQty_taco_chips());
			stmt.setDouble(10, prices.getQty_can_coke());
			stmt.setDouble(11, prices.getQty_can_orange());
			stmt.setDouble(12, prices.getQty_bottle_coke());
			stmt.setDouble(13, prices.getQty_bottle_water());
			
			// Execute update to database
			int updateRowsEffected = stmt.executeUpdate(query);
		
		}
		catch (SQLException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
		
		// close connection with database
		finally {
			if (rs != null) {
				try {rs.close();} catch (Exception e) {e.printStackTrace();}
			}
			if (stmt != null) {
				try {stmt.close();} catch (Exception e) {e.printStackTrace();}
				}
			if (con != null) {
				try {con.close();} catch (Exception e) {e.printStackTrace();}
			}
		}

		
	}

}
