package com.projectOneClient.servlets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class RESTUser {

    @GET
    @Produces( MediaType.TEXT_XML )
    @Path( "/resxml" )
    public RESTUser testObjectXML() {
        RESTUser obj = new RESTUser();
        // business logic
        return obj;
    }

    @GET
    @Produces( MediaType.APPLICATION_JSON )
    @Path( "/users" )
    public RESTUser testObjectJSON() {
        RESTUser obj = new RESTUser();

        return obj;
    }

}
