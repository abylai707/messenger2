package com.example.messenger.lesson3;

public class Leopard extends Animal{
    @Override
    String move() {
        return "run" + velocity;
    }
}
