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
public class CartoonNetwork extends ChannelDecorator{

    public CartoonNetwork(SatelliteTV satelliteTV) {
        super(satelliteTV);
    }

    @Override
    public void show(int channelNumber) {
        if(channelNumber>150 && channelNumber<200){
            System.out.println("Enjoy Mickey");
        }else{
            this.satelliteTV.show(channelNumber);
        }
    }

    @Override
    public int subscriptionPrice() {
        return getSatelliteTV().subscriptionPrice() + 10;
    }    
}
