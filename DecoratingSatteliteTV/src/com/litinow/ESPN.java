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
public class ESPN extends ChannelDecorator{

    public ESPN(SatelliteTV satelliteTV) {
        super(satelliteTV);
    }

    @Override
    public void show(int channelNumber) {
        if(channelNumber>100 && channelNumber<150){
            System.out.println("Enjoy Football Match");
        }else{
            this.satelliteTV.show(channelNumber);
        }
    }

    @Override
    public int subscriptionPrice() {
        return this.getSatelliteTV().subscriptionPrice() + 20;
    }    
}
