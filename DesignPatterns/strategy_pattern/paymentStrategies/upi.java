package DesignPatterns.strategy_pattern.paymentStrategies;

import DesignPatterns.strategy_pattern.paymentStrategy;

public class upi implements paymentStrategy {
    String upiId;
    upi(String upiId){
        this.upiId = upiId;
    }

    public void pay(){
        System.out.println("Paying using upi");
    }
}