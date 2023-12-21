package com.example.factorypattern.service;

import org.springframework.stereotype.Service;

@Service
public class BurgerService {

    public void getBurger(String type) {
        Burger burger = BurgerFactory.getBurger(type);
        System.out.println(burger.getIngredients());
        System.out.println(burger.prepare());
    }

}
