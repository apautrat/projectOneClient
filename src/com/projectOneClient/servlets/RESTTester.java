package com.projectOneClient.servlets;

import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;

import com.projectOneClient.model.Tweet;
import com.projectOneClient.model.User;

public class RESTTester {
    private String USER_URI  = "http://localhost:8080/projectOne/rest/res/users";
    private String TWEET_URI = "http://localhost:8080/projectOne/rest/res/tweetsid/";

    public List<User> listUsers() throws InterruptedException, ExecutionException {

        Client client = ClientBuilder.newClient();

        GenericType<List<User>> gen = new GenericType<List<User>>() {
        };
        List<User> list = client.target( USER_URI ).request().get( gen );

        System.out.println( list.get( 2 ).getName() );

        return list;
    }

    public List<Tweet> listTweetsId( String id ) throws InterruptedException, ExecutionException {

        Client client = ClientBuilder.newClient();

        GenericType<List<Tweet>> gen = new GenericType<List<Tweet>>() {
        };
        System.out.println( id );
        List<Tweet> list = client.target( TWEET_URI ).path( id ).request().get( gen );

        return list;
    }

}
