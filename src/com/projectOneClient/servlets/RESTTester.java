package com.projectOneClient.servlets;

import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import org.apache.log4j.Logger;

import com.projectOneClient.model.Tweet;
import com.projectOneClient.model.User;

public class RESTTester {

    private Client    client;
    private WebTarget target;
    
    // Addresse de l'URI pointant sur le serveur
    private String    URI = "http://localhost:8080/projectOne/rest/res/";
    
    // Log4J
    static Logger     log = Logger.getLogger( RESTTester.class );

    public RESTTester() 
    {
        client = ClientBuilder.newClient();
        target = client.target( URI );
    }

    public List<User> listUsers() throws InterruptedException, ExecutionException 
    {
        GenericType<List<User>> gen = new GenericType<List<User>>() {};

        List<User> list = target.path( "users" ).request().get( gen );
        log.info( "User List retrieved : " + list );

        return list;
    }

    public List<Tweet> listTweets() throws InterruptedException, ExecutionException 
    {
        GenericType<List<Tweet>> gen = new GenericType<List<Tweet>>() {};

        List<Tweet> list = target.path( "tweets" ).request().get( gen );
        log.info( "Tweet List retrieved : " + list );

        return list;
    }
    
    public List<Tweet> listTweetsId( long id ) throws InterruptedException, ExecutionException 
    {
        GenericType<List<Tweet>> gen = new GenericType<List<Tweet>>() {};

        List<Tweet> list = target.path( "tweetsid" ).path( Long.toString(id) ).request().get( gen );
        log.info( "Tweet List retrieved : " + list );

        return list;
    }

    public void updateData() throws InterruptedException, ExecutionException 
    {
        target.path( "updatedata" ).request().get();
        log.info( "Data Updated ! That's alrigth mate." );
    }

}
