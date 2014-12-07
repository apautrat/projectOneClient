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
public class TweetsId extends HttpServlet {
    public static final String VUE = "/WEB-INF/test.jsp";

    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        String tweetId = request.getParameter( "tweetid" );
        System.out.println( tweetId );
        RESTTester test = new RESTTester();
        List<Tweet> list;
        try {
            list = test.listTweetsId( tweetId );
            request.setAttribute( "listTweets", list );
        } catch ( InterruptedException e ) {

            e.printStackTrace();
        } catch ( ExecutionException e ) {

            e.printStackTrace();
        }

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
