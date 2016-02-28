package com.apiomega.api.helloworld.api;

import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * A simple API that implements our hello world logic. Note that we must expose these
 * endpoints under the "api" path to conform with the APIOmega standards.
 */
@io.swagger.annotations.Api
@Path("/api")
public class Api {
    /**
     * Our hello world implementation
     * @return "Hello World"
     */
    @ApiOperation(value = "A sample API method",
            notes = "Returns \"Hello World\" as an example of a API method",
            response = String.class)
    @GET
    @Path("hello")
    public String hello() {
        return "Hello World";
    }
}
