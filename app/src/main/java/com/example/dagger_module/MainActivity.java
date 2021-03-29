package com.example.dagger_module;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger_module.Dagger.BusinessComponent;
import com.example.dagger_module.Dagger.DaggerBusinessComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    BusinessComponent component;
    @Inject
    Business business;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerBusinessComponent.create();
        component.inject(this);
        business.StartBusiness();
    }
}