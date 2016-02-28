package com.apiomega.api.helloworld.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * A simple API that implements our hello world logic. Note that we must expose these
 * endpoints under the "api" path to conform with the APIOmega standards.
 */
@Path("/api")
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
