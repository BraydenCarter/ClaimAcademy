package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GpaServlet
 */
@WebServlet("/GpaServlet")
public class GpaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GpaServlet() {
        // TODO Auto-generated constructor stub
    	int credit = 12;
		double gpa =((Double.parseDouble(grade1)*credit)+(Double.parseDouble(grade2)*credit)+(Double.parseDouble(grade3)*credit) )/36;

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String grade1 = request.getParameter("gradeOne");
		String grade2 = request.getParameter("gradeTwo");
		String grade3 = request.getParameter("gradeThree");

		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
