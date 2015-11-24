package com.ibm.gbscompatibility;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.ibm.gbscompatibility.CustomAuthResource;

public class CustomOAuthSampleApplication extends Application {

    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(CustomAuthResource.class);
        return classes;
    }
}

