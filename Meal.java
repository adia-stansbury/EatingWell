/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;
import java.util.EnumMap;
import java.util.HashMap;

/**
 *
 * @author Adia
 */
public class Meal {
    EnumMap<Ingredient, Double> ingredients;
    
    Meal() { 
        ingredients = new EnumMap<Ingredient, Double>(Ingredient.class);
        ingredients.put(Ingredient.YOGURT_GREEK_WHOLE_MILK_PLAIN, 245.00);
    }
    
    public double nutrientAmount(Nutrient nutrient) {
        // TODO: add logic
        return 4;
    }
    
    private double nutrition(Ingredient ingredient, Nutrient nutrient) {
        return ingredientPortion(ingredient) * Ingredient.zincAmount();
    };
    
    private double ingredientPortion(Ingredient ingredient) {
        return ingredients.get(ingredient)/Ingredient.PORTION_AMOUNT;  
    }
}