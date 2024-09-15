package com.fruity;

import io.javalin.Javalin;

public class fruityApp {
    public static void main(String[] args) {
        //initialize server
        Javalin app = Javalin.create().start();

        //create instance of fruityController to handle http requests
        FruityController fruityController = new FruityController()

    }

}