package com.example.dagger_module;

import java.util.jar.Attributes;

import javax.inject.Inject;

public class Business {

    Logo logo;
    BusinessName name;

    @Inject
    public Business(Logo logo, BusinessName name) {
        this.logo = logo;
        this.name = name;
    }

    public void StartBusiness(){
        System.out.println("Starting Business With " + logo.getShape()  + " Logo Shape & " + name.getName() + " Name") ;
    }
}
