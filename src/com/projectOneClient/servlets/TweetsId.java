package com.projectOneClient.servlets;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectOneClient.model.Tweet;

@SuppressWarnings( "serial" )
public class TweetsId extends HttpServlet 
{
	// Lien de la JSP listant tous les Tweets en fonction d'un id
    public static final String VUE = "/WEB-INF/tweetsId.jsp";

    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException 
    {
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException 
    {
    	// On recupere le parametre POST tweetid
        long tweetId = Long.parseLong(request.getParameter( "tweetid" ));
        
        RESTTester test = new RESTTester();
        List<Tweet> list = null;
        
        try 
        {
        	// On recupere la liste de tous les Tweets en fonction de tweetId
            list = test.listTweetsId( tweetId );
            
			// On passe la liste de tous ces Tweets en attribut du HttpServletRequest
            request.setAttribute( "listTweets", list );
        } 
        catch ( InterruptedException e ) {
            e.printStackTrace();
        } 
        catch ( ExecutionException e ) {
            e.printStackTrace();
        }

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
