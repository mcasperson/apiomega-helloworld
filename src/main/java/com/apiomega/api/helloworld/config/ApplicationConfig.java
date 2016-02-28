package com.apiomega.api.helloworld.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * There are a few ways to bootstrap a JAX-RS application. See
 * https://docs.jboss.org/author/display/AS7/JAX-RS+Reference+Guide
 * for details
 */
@ApplicationPath("/")
public class ApplicationConfig extends Application {

}