package com.fruity.model;

import java.util.List;

public class SpinResult {
    //create fields in class for storing symbols and payout 
    private List<String> symbols;
    private int payout;

    //when called upon with symbols and payout parameters, stores values in dedicated fields
    public SpinResult(List<String> symbols, int payout){
        this.symbols = symbols;
        this.payout = payout;

    }

    //getter methods for retrieving symbols and payout data, respectively
    public List<String> getSymbols() {
        return symbols;
    }

    public int getPayout() {
        return payout;
    }
}