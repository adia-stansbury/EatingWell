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
public class Food {
    public static final double GRAM_PORTION_WEIGHT = 100.00;
    String name;
    double amountOfZincPerPortion;
    String zincUnitName;
    
    Food(String name, double amountOfZincPerPortion, String zincUnitName) {
        this.name = name;
        this.amountOfZincPerPortion = amountOfZincPerPortion;
        this.zincUnitName = zincUnitName;
    }
    
    public String name() { return name; }
    public double amountOfZincPerPortion() { return amountOfZincPerPortion; }
    public String zincUnitName() { return zincUnitName; }
}
