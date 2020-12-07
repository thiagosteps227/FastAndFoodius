package edu.ait.controller.copy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ait.model.User;
import edu.ait.model.UserDAO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginControllerServlet")
public class LoginControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControllerServlet() {
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
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("formType");
		String name = request.getParameter("name");
		String a = request.getParameter("address");
		String p = request.getParameter("password");
		
		User u = new User(name, a, p);
		
		if (type.contentEquals("register")) {
			
			try {
				UserDAO.instance.save(u);
	
			} catch (Exception e){
				System.out.println("Problem saving the new user in the database");
			}
			request.setAttribute("my_user", u);
			request.getRequestDispatcher("ShowLoginDone.jsp").forward(request, response);
			
		} else {
			
			try {
				
				User newUser = UserDAO.instance.selectOne(a);
				
				if (newUser != null) {
					request.setAttribute("my_user", newUser);
					request.getRequestDispatcher("Menu_CalculatorTest.jsp").forward(request, response);
				} else {
					System.out.print("sorry you dont exist");
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}
