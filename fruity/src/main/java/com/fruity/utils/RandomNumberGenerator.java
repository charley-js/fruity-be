package com.fruity.utils;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {
    //create instance of javas secure random method
    private final SecureRandom random = new SecureRandom();
    //initialize array of possible symbols
    private final String[] symbols = {"🍌", "🍎", "🍓", "🍉", "🍒", "🍋"};

    public List<String> generateSymbols() {
        //initialize array for holding generated symbols
        List<String> result = new ArrayList<>();
        //add random symbol to result array 3 times and return array
        for(int i = 0; i < 3; i++){
            result.add(symbols[random.nextInt(symbols.length)]);
        }
        return result;
    }
}