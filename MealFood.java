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
    
    public double nutrientAmount(Nutrient nutrient) {
        return food.nutritionPerPortion(nutrient) * numberOfPortions();
    }
    
    private double numberOfPortions() {
        return gramWeight/Food.GRAM_PORTION_WEIGHT;  
    }
}
