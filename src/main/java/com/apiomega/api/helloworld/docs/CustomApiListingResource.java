package com.apiomega.api.helloworld.docs;

import io.swagger.jaxrs.listing.ApiListingResource;

import javax.ws.rs.Path;

/**
 * An overridden version of the Swagger ApiListingResource which defines
 * a custom path under which we can access swagger.json and swagger.yaml
 */
@Path("docs")
public class CustomApiListingResource extends ApiListingResource {
}
