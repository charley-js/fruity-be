package com.fruity;

import io.javalin.Javalin;
import com.fruity.controller.FruityController;

public class FruityApp {
    public static void main(String[] args) {
        //initialize server and start
        Javalin app = Javalin.create().start();

        //create instance of fruityController to handle http requests
        FruityController fruityController = new FruityController();

        //Define endpoints
        app.get("/", ctx -> ctx.result("Fruity Slots API. /spin to try it out"));
        app.get("/spin", fruityController::spin );


    }

}