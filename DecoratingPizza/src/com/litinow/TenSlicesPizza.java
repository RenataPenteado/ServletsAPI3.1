/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Renata
 */
public class TenSlicesPizza implements Pizza {
    public Date productionDate;
    
    public TenSlicesPizza() {
        productionDate = new Date();
        System.out.println("Adding Dough");
    }
    
    @Override
    public String getDescription() {
        return "Ten slices";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
    
    @Override
    public Date getValidate() {
        Calendar c = Calendar.getInstance();
        c.setTime(productionDate);
        c.add(Calendar.DATE, 10);  // number of days to add
        return c.getTime(); 
    }

}
