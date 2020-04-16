/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.AbstractMap;

/**
 *
 * @author Adia
 */
public class Meal {
    private static final double GRAM_PORTION_WEIGHT = 100.00;
    HashMap<String, AbstractMap> foods = new HashMap();
    EnumMap<Nutrient, HashMap> foodNutrientDetails = new EnumMap<Nutrient, HashMap>(Nutrient.class);
   
    Meal() { 
        HashMap<String, Double> foodDetails = new HashMap();
        foodDetails.put("gramWeight", 245.00);
        foods.put("Yogurt,Greek,Whole Milk,Plain", foodDetails);
        HashMap<String, String> yogurtZincUnitName = new HashMap();
        yogurtZincUnitName.put("unitName", "mg");
        HashMap<String, Double> yogurtZincAmount = new HashMap();
        yogurtZincAmount.put("amount", 0.52);
        foodNutrientDetails.put(Nutrient.ZINC, yogurtZincUnitName);
        foodNutrientDetails.put(Nutrient.ZINC, yogurtZincAmount);
        foods.put("nutrients", foodNutrientDetails);
    }
    
    public double nutrientAmount(Nutrient nutrient) {
        // TODO: add logic
        return 4;
    }
    
    private double nutrition(String food, Nutrient nutrient) {
        return gramFoodPortion(food) * gramFoodNutrientAmount(food, nutrient);
    };
    
    private double gramFoodPortion(String food) {
        System.out.println(foods.get("Yogurt,Greek,Whole Milk,Plain"));
        return foods.get(food).get("gramWeight")/GRAM_PORTION_WEIGHT;  
    }
    
    private double gramFoodNutrientAmount(String food, Nutrient nutrient) {
        // TODO: convert amount to grams
        return foods.get(food).get("nutrients").get(nutrient).get("amount");
    }
}