package com.company;

public class Main {

    public static void main(String[] args) {
        Plant teddy = new Plant("lily", "Teddy");

        teddy.setWateringInstructions("Teddy needs water often.");
        teddy.getWateringInstructions();

        teddy.setSunlightInstructions("Teddy should stay near a window for sunlight.");
        teddy.getSunlightInstructions();

    }
}