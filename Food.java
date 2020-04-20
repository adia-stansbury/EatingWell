/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;
import java.util.HashMap;

/**
 *
 * @author Adia
 */
public class Food {
    public static final double GRAM_PORTION_WEIGHT = 100.00;
    String name;
    public static HashMap<String, HashMap<Nutrient, HashMap<String, Object>>> nutritionPerPortion = new HashMap();
           
    Food(String name) {
        this.name = name;
        
        HashMap<Nutrient, HashMap<String, Object>> nutrients = new HashMap();
        
        nutrients.put(Nutrient.ZINC, nutrientDetails(0.52));
        nutrients.put(Nutrient.IRON, nutrientDetails(0));
        nutrients.put(Nutrient.CALCIUM, nutrientDetails(100.00));
        nutrients.put(Nutrient.CHOLINE, nutrientDetails(15.1));
        nutrients.put(Nutrient.COPPER, nutrientDetails(17.0));
        nutrients.put(Nutrient.FOLATE, nutrientDetails(5.0));
        nutrients.put(Nutrient.MAGNESIUM, nutrientDetails(11.0));
        nutrients.put(Nutrient.NIACIN, nutrientDetails(0.208));
        nutrients.put(Nutrient.PHOSPHORUS, nutrientDetails(135.0));
        nutrients.put(Nutrient.POTASSIUM, nutrientDetails(141.0));
        nutrients.put(Nutrient.RIBOFLAVIN, nutrientDetails(0.278));
        nutrients.put(Nutrient.SELENIUM, nutrientDetails(9.7));
        nutrients.put(Nutrient.SODIUM, nutrientDetails(0.035));
        nutrients.put(Nutrient.THIAMIN, nutrientDetails(0.023));
        nutrients.put(Nutrient.VITAMIN_A, nutrientDetails(2.0));
        nutrients.put(Nutrient.VITAMIN_B12, nutrientDetails(0.75));
        nutrients.put(Nutrient.VITAMIN_B6, nutrientDetails(0.063));
        nutrients.put(Nutrient.VITAMIN_C, nutrientDetails(0.0));
        nutrients.put(Nutrient.VITAMIN_D, nutrientDetails(0.0));
        nutrients.put(Nutrient.VITAMIN_E, nutrientDetails(0.01));
        nutrients.put(Nutrient.VITAMIN_K, nutrientDetails(0.0));
                
        nutritionPerPortion.put("Yogurt,Greek,Whole Milk,Plain", nutrients);
    }
    
    public HashMap foodDetails() {
        return nutritionPerPortion.get(name);
    }
    
    public String name() { return name; }
    
    public double nutritionPerPortion(Nutrient nutrient) { 
        return (double)nutritionPerPortion.get(name).get(nutrient).get("amount");
    }
    
    private HashMap<String, Object> nutrientDetails(double amount) {
        // amount is in same unit as enum Nutrient unit
        HashMap<String, Object> details = new HashMap();
        
        details.put("amount", amount);
        
        return details;
    }
}
