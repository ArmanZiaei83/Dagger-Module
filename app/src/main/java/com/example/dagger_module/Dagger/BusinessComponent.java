package com.example.dagger_module.Dagger;

import com.example.dagger_module.Business;

import dagger.Component;

@Component
public interface BusinessComponent {

    Business getBusiness();
}
