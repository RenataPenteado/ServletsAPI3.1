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
public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza pizza) {
        super(pizza);
        System.out.println("Adding TomatoSauce");
    }
    
    public String getDescription(){
        return tempPizza.getDescription() + ", TomatoSauce";
   }
    
   public double getCost(){
       return tempPizza.getCost() + 0.50;
   }
   
   @Override
    public Date getValidate() {
        Date tomatoSauceDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(tomatoSauceDate);
        c.add(Calendar.DATE, 6);  // number of days to add
        tomatoSauceDate = c.getTime(); 
        
        if(tempPizza.getValidate().compareTo(tomatoSauceDate) >= 0){
            return tomatoSauceDate;
        }else{
            return tempPizza.getValidate();
        }
    }
}
