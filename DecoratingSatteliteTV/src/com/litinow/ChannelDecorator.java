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
public abstract class ChannelDecorator implements SatelliteTV {
    public SatelliteTV satelliteTV;

    public ChannelDecorator(SatelliteTV satelliteTV) {
        this.satelliteTV = satelliteTV;
    }

    public SatelliteTV getSatelliteTV(){
        return satelliteTV;
    }
    
}
