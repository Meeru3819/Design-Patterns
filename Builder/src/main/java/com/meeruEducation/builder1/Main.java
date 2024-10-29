package com.meeruEducation.builder1;

public class Main {
    public static void main(String[] args) {

        // Building a simple house with only the required parameters
        House simpleHouse = new House.Builder("Concret", 3 ,2).build();
        System.out.println(simpleHouse);

        // Building a luxurious house with all optional features
        House luxuryHouse = new House.Builder("Marble", 5 ,4)
                .setHasGarage(true)
                .setHasPool(true)
                .setHasRoofTop(true)
                .setFlooringType("HardWood")
                .setHasGarden(true)
                .build();

        System.out.println(luxuryHouse);

        // Building a villa with a garden and pool but no garage
        House villa = new House.Builder("Wood", 6, 5)
                .setHasGarden(true)
                .setHasPool(true)
                .setFlooringType("Tile")
                .build();

        System.out.println(villa);

        // Building Apartment

        House appartment = new House.Builder("concret", 4, 2)
                .setHasGarage(false)
                .setHasGarden(true)
                .setHasPool(true)
                .setFlooringType("tiles")
                .build();

        System.out.println(appartment);
    }
}
