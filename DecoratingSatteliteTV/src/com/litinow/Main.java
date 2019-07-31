/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow;

/**
 *
 * @author Renata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SatelliteTV satelliteTV = new ESPN(new CartoonNetwork(new SkyTV()));
        System.out.println("Sky TV created with ESPN and CartoonNetwork");
        System.out.println("Total price: " + satelliteTV.subscriptionPrice());
        System.out.println("");
        System.out.println("Select channel 20");
        satelliteTV.show(20);
        System.out.println("Select channel 120");
        satelliteTV.show(120);
        System.out.println("Select channel 170");
        satelliteTV.show(170);
        System.out.println("Select channel 220");
        satelliteTV.show(220);
    }
    
}
