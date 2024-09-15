package com.fruity.service;

import com.fruity.model.SpinResult;
import com.fruity.utils.RandomNumberGenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class GameLogic {
    //create instance of RandomNumberGenerator to generate symbols
    private final RandomNumberGenerator rng = new RandomNumberGenerator();
    //initialize hashmap to hold symbol-payout relationship
    private final Map<String, Integer> symbolPayouts = new HashMap<>();

    public GameLogic() {
        //define symbol-payout relationships
        symbolPayouts.put("🍌", 140);
        symbolPayouts.put("🍎", 240);
        symbolPayouts.put("🍓", 320);
        symbolPayouts.put("🍉", 400);
        symbolPayouts.put("🍒", 500);
        symbolPayouts.put("🍋", 750);

    }

    public SpinResult processSpin() {
        //retrieve random symbols from RandomNumberGenerator generateSymbols() method
        List<String> symbols = rng.generateSymbols();
        //invoke payout calculator with symbols and store result
        int payout = calculatePayout(symbols);
        //return symbols and payout to SpinResult for data structure
        return new SpinResult(symbols, payout);
    }

    private int calculatePayout(List<String> symbols) {
        String firstSymbol = symbols.get(0);
        if(symbols.get(1).equals(firstSymbol) && symbols.get(2).equals(firstSymbol)) {
            return symbolPayouts.get(firstSymbol);
        }
        return 0;

    }

}

