/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Renata
 */
public class Onion extends ToppingDecorator{

    public Onion(Pizza pizza) {
        super(pizza);
         System.out.println("Adding Onion");
    }
    
        @Override
    public String getDescription() {
       return tempPizza.getDescription() + ", Onion";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
    
    @Override
    public Date getValidate() {
        Date onionDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(onionDate);
        c.add(Calendar.DATE, 4);  // number of days to add
        onionDate = c.getTime(); 
        
        if(tempPizza.getValidate().compareTo(onionDate) >= 0){
            return onionDate;
        }else{
            return tempPizza.getValidate();
        }
    }
    
}
