package com.codingshuttle.sushma.week1Introduction.introductiontoSpringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CakeBaker {
    @Autowired
    private Frosting frosting;
    @Autowired
    private Syrup syrup;



    public void bakeCake() {
        System.out.println("Baking cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType());
    }
}
