package com.example.factorypattern.service.impl;

import com.example.factorypattern.service.Burger;
import org.springframework.stereotype.Component;

@Component
public class ChickenBurger implements Burger {
    @Override
    public String getType() {
        return "chicken";
    }

    @Override
    public String getIngredients() {
        return "Getting ingredients for chicken burger";
    }

    @Override
    public String prepare() {
        return "Preparing chicken burger";
    }
}
