package com.uca.capas.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnotacionServlet
 */
@WebServlet("/AnotacionServlet")
public class AnotacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnotacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//oGet(request, response);
		String compUser = "Gerardo";
		String compPass = "123";
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		if (user.equals(compUser)&& pass.equals(compPass)) {
			out.println("<html>");
			out.println("<body");
			out.println("<h3> Welcome </h3>");
			out.println("</body>");
			out.println("</html>");
		}else {
			out.println("<html>");
			out.println("<body");
			out.println("<h3> NOPE </h3>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
