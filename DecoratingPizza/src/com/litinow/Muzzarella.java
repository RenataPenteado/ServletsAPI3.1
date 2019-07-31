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
public class Muzzarella extends ToppingDecorator {
    public Muzzarella(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Muzzarella");
    }
    
    public String getDescription(){
        return tempPizza.getDescription() + ", Muzzzarella";
   }
    
   public double getCost(){
       return tempPizza.getCost() + 2.50;
   }

    @Override
    public Date getValidate() {
        Date muzzDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(muzzDate);
        c.add(Calendar.DATE, 12);  // number of days to add
        muzzDate = c.getTime(); 
        
        if(tempPizza.getValidate().compareTo(muzzDate) >= 0){
            return muzzDate;
        }else{
            return tempPizza.getValidate();
        }
    }
}
