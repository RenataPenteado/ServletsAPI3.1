/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow;

import java.text.SimpleDateFormat;

/**
 *
 * @author Renata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Pizza pizza_1 = new TomatoSauce(new Muzzarella(new Onion(new EightSlicesPizza())));
        System.out.println("Pizza 1:");
        System.out.println("\tDescription:");
        System.out.println("\t\t"+pizza_1.getDescription());
        System.out.println("\tPrice:");
        System.out.println("\t\t"+pizza_1.getCost());
        System.out.println("\tValidate:");        
        System.out.println("\t\t"+sdf.format(pizza_1.getValidate()));
        System.out.println();
          Pizza pizza_2 = new TomatoSauce(new Muzzarella(new TenSlicesPizza()));
        System.out.println("Pizza 2:");
        System.out.println("\tDescription:");
        System.out.println("\t\t"+pizza_2.getDescription());
        System.out.println("\tPrice:");
        System.out.println("\t\t"+pizza_2.getCost());
        System.out.println("\tValidate:");  
        System.out.println("\t\t"+sdf.format(pizza_2.getValidate()));
    }
    
}
