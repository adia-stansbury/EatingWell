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
public class MealFood {
    Food food;
    double gramWeight;
    
    MealFood(Food food, double gramWeight) {
        this.food = food;
        this.gramWeight = gramWeight;
    }
    
    public double zincAmount() {
        return food.amountOfZincPerPortion * numberOfPortions();
    }
    
    private double numberOfPortions() {
        return gramWeight/Food.GRAM_PORTION_WEIGHT;  
    }
}
