package DesignPatterns.strategy_pattern.paymentStrategies;

import DesignPatterns.strategy_pattern.paymentStrategy;

public class debitcard implements paymentStrategy{
    private int cardNo;
    debitcard(int cardNo){
        this.cardNo = cardNo;
    }

    public void pay(){
        System.out.println("paying using debit card");
    }
}
