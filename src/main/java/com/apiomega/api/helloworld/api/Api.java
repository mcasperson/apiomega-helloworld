package com.apiomega.api.helloworld.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * A simple API that implements our hello world logic
 */
@Path("/")
public class Api {
    /**
     * Our hello world implementation
     * @return "Hello World"
     */
    @GET
    @Path("hello")
    public String hello() {
        return "Hello World";
    }
}
