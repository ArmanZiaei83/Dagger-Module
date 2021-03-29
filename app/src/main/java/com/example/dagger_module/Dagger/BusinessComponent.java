package com.example.dagger_module.Dagger;

import com.example.dagger_module.Business;
import com.example.dagger_module.MainActivity;

import dagger.Component;

@Component(modules = BusinessModule.class)
public interface BusinessComponent {

    void inject(MainActivity mainActivity);

}
