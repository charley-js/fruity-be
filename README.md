# Fruity API

Find the hosted version [here](https://fruity-be.onrender.com).

## Contents

- [Summary](#summary)
- [Features](#features)
- [Languages And Frameworks](#languages-and-frameworks)

## Summary

This is a personal project I created to explore different technologies such as Java & Docker, being the first time I have used either, and also to delve into game development. This project is an API for a slot-machine , handling requests from the front-end and the game logic of each spin, reutrning the result to the the application.

I built this project using an MVC architectual pattern.

I have hosted the the API on [Render](https://render.com/).

## Features

- MVC pattern and project structure.
- Containerized with Docker for deployment.
- /spin endpoint to calculate the result of each spin.
- Custom RNG method for randomising symbols per spin.
- Balance method for initializing starting balance and amending balance on each spin.
- GameLogic method which defines the payout for matching symbols, using RNG and Balance methods to calculate payout per spin.

## Languages and Frameworks

- Java
- Docker
- Maven
- Javelin
