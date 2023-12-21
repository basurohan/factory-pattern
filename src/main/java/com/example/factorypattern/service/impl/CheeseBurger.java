package com.example.factorypattern.service.impl;

import com.example.factorypattern.service.Burger;
import org.springframework.stereotype.Component;

@Component
public class CheeseBurger implements Burger {
    @Override
    public String getType() {
        return "cheese";
    }

    @Override
    public String getIngredients() {
        return "Getting ingredients for cheese burger";
    }

    @Override
    public String prepare() {
        return "Preparing cheese burger";
    }
}
