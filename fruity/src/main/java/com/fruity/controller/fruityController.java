package com.fruity.controller;

import io.javalin.http.Context;
import com.fruity.model.SpinResult;
import com.fruity.service.GameLogic;

public class FruityController {

    //create instance of GameLogic for handling the logic of the spin
    private final GameLogic gameLogic = new GameLogic();

    public void spin(Context ctx) {
        //calls gameLogic processSpin() method to retrieve result of the spin
        SpinResult result = gameLogic.processSpin();
        //send result of spin to front-end
        ctx.json(result);

    }
}