package com.example.dagger_module.Dagger;

import androidx.transition.Visibility;

import com.example.dagger_module.Business;
import com.example.dagger_module.BusinessName;
import com.example.dagger_module.Logo;

import java.util.function.LongFunction;

import dagger.Module;
import dagger.Provides;

@Module
public class BusinessModule {

    @Provides
    BusinessName getBusinessName(){
        return new BusinessName("Hadish");
    }

    @Provides
    Logo getBusinessLogo(){
        return new Logo("Circle", "Green");
    }

    @Provides
    Business provideBusiness(){
        return new Business(getBusinessLogo(), getBusinessName());
    }
}
