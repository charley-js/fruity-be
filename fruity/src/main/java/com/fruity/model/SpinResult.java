package com.fruity.model;

import java.util.List;

public class SpinResult {
    //create fields in class for storing symbols and payout and balance 
    private List<String> symbols;
    private int payout;
    private int balance;


    //when called upon with symbols, balance and payout parameters, stores values in dedicated fields
    public SpinResult(List<String> symbols, int payout, int balance){
        this.symbols = symbols;
        this.payout = payout;
        this.balance = balance;

    }

    //getter methods for retrieving symbols and payout data, respectively
    public List<String> getSymbols() {
        return symbols;
    }

    public int getPayout() {
        return payout;
    }

    public int getBalance(){
        return balance;
    }
}