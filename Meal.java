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
    EnumMap<Food, HashMap<String, Double>> foods;
    HashMap<String, Double> foodMealDetails = new HashMap();
    
    Meal() { 
        foods = new EnumMap<Food, HashMap<String, Double>>(Food.class);
        foodMealDetails.put("gramWeight", 245.00);
        foods.put(Food.YOGURT_GREEK_WHOLE_MILK_PLAIN, foodMealDetails);
    }
    
    public double nutrientAmount(Nutrient nutrient) {
        // TODO: add logic
        return 4;
    }
    
    private double nutrition(Food food, Nutrient nutrient) {
        return foodPortion(food) * Food.zincAmount();
    };
    
    private double foodPortion(Food food) {
        return foods.get(food).get("gramWeight")/Food.PORTION_AMOUNT;  
    }
}