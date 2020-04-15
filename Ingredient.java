/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;

/**
 *
 * @author Adia
 */
public enum Ingredient {
    YOGURT_GREEK_WHOLE_MILK_PLAIN(0.52, "mg");
    
    public static final double PORTION_AMOUNT = 100.00;
    public static final String PORTION_UNIT = "g";
    private static final double zincAmount;
    private final String zincUnit;
    
    Ingredient(double zincAmount, String zincUnit) {
//        this.zincAmount = zincAmount;
        this.zincUnit = zincUnit; 
    }
    
    public static double zincAmount() { return zincAmount; }
}

