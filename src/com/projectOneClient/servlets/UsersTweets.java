package com.projectOneClient.servlets;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectOneClient.model.Tweet;
import com.projectOneClient.model.User;

@SuppressWarnings( "serial" )
public class UsersTweets extends HttpServlet {
	public static final String VUE = "/WEB-INF/usersTweets.jsp";

	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		RESTTester test = new RESTTester();
		List<User> listUsers = null;
		List<Tweet> listTweets = null;
		try { 
			// Liste de tous les utilisateurs
			listUsers = test.listUsers();
			request.setAttribute( "listUsers", listUsers );
			
			// Liste de tous les tweets
			listTweets = test.listTweets();
			request.setAttribute("listTweets", listTweets);
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
