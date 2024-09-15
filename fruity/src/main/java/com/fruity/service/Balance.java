package com.fruity.service;

//Creates balance class to set and amend play balanace
public class Balance {
    private int balance;

    //sets defaullt balance
    public Balance(){
        this.balance = 1000;
    }

    //method for returning current balance
    public int getBalance(){
        return balance;
    }

    //method for amending balance
    public void updateBalance(int amount){
        this.balance += amount;
    }
}
