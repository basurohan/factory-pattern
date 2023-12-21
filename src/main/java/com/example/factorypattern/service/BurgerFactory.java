package com.example.factorypattern.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class BurgerFactory {

    @Autowired
    private List<Burger> burgers;

    public static Map<String, Burger> burgerCache = new HashMap<>();

    @PostConstruct
    public void initBurgerCache() {
        for (Burger burger : burgers) {
            burgerCache.put(burger.getType(), burger);
        }
    }

    public static Burger getBurger(String type) {
        if (burgerCache.containsKey(type)) {
            return burgerCache.get(type);
        } else {
            return burgerCache.get("cheese");
        }
    }

}
