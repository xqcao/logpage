package com.LoginPage.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginApp
 */
@WebServlet("/login")
public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if( request.getParameter("username") == null || request.getParameter("password") == null){
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			return;
		}
		String userNameString = request.getParameter("username").toString();
		String passWordString = request.getParameter("password").toString();
		
		request.setAttribute("userName", userNameString);
		request.setAttribute("passWord", passWordString);
		getServletContext().getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
