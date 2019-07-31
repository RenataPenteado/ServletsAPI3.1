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
public class SkyTV implements SatelliteTV{

    @Override
    public void show(int channelNumber) {
        if(channelNumber<100){
            System.out.println("Basic News Channels");
        }else{
            System.out.println("You are not subscribed - Please subscribe");
        }
    }

    @Override
    public int subscriptionPrice() {
      return 100;
    }
    
}
