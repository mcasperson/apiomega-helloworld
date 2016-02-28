package com.apiomega.api.helloworld.config;

import com.apiomega.api.helloworld.api.Api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * There are a few ways to bootstrap a JAX-RS application. See
 * https://docs.jboss.org/author/display/AS7/JAX-RS+Reference+Guide
 * for details
 */
@ApplicationPath("/")
public class ApplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();
        classes.add(Api.class);
        return classes;
    }
}