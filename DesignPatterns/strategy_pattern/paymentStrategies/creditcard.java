package DesignPatterns.strategy_pattern.paymentStrategies;

import DesignPatterns.strategy_pattern.paymentStrategy;

public class creditcard implements paymentStrategy {
    private int cardNo;
    creditcard(int cardNo){
        this.cardNo = cardNo;
    }
    public void pay(){
        System.out.println("paying using credit card");
    }
}
