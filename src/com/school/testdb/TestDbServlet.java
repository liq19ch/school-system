package com.school.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userString = "springstudent";
		String passString= "springstudent";
		String jdbcUrlString = "jdbc:mysql://localhost:3306/school-system?useSSL=false&serverTimezone=UTC";
		String driverString = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database: "+jdbcUrlString);
			
			Class.forName(driverString);
			
			Connection myConnection = DriverManager.getConnection(jdbcUrlString, userString, passString);
			
			out.println("Successful");
			
			myConnection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServletException();
		}
		
	}

}
