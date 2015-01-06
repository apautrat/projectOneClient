package com.projectOneClient.servlets;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectOneClient.model.User;

@SuppressWarnings( "serial" )
public class ListUsers extends HttpServlet {
	public static final String VUE = "/WEB-INF/users.jsp";

	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		RESTTester test = new RESTTester();
		List<User> list = null;
		try { 
			list = test.listUsers();
			request.setAttribute( "listUsers", list );
		} catch ( InterruptedException e ) {
			e.printStackTrace();
		} catch ( ExecutionException e ) {
			e.printStackTrace();
		}

		this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

	}

}
