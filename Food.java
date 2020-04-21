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
        
        HashMap<Nutrient, HashMap<String, Object>> nutritionForYogurt = new HashMap();
        
        nutritionForYogurt.put(Nutrient.ZINC, nutrientDetails(0.52));
        nutritionForYogurt.put(Nutrient.IRON, nutrientDetails(0));
        nutritionForYogurt.put(Nutrient.CALCIUM, nutrientDetails(100.00));
        nutritionForYogurt.put(Nutrient.CHOLINE, nutrientDetails(15.1));
        nutritionForYogurt.put(Nutrient.COPPER, nutrientDetails(17.0));
        nutritionForYogurt.put(Nutrient.FOLATE, nutrientDetails(5.0));
        nutritionForYogurt.put(Nutrient.MAGNESIUM, nutrientDetails(11.0));
        nutritionForYogurt.put(Nutrient.NIACIN, nutrientDetails(0.208));
        nutritionForYogurt.put(Nutrient.PHOSPHORUS, nutrientDetails(135.0));
        nutritionForYogurt.put(Nutrient.POTASSIUM, nutrientDetails(141.0));
        nutritionForYogurt.put(Nutrient.RIBOFLAVIN, nutrientDetails(0.278));
        nutritionForYogurt.put(Nutrient.SELENIUM, nutrientDetails(9.7));
        nutritionForYogurt.put(Nutrient.SODIUM, nutrientDetails(0.035));
        nutritionForYogurt.put(Nutrient.THIAMIN, nutrientDetails(0.023));
        nutritionForYogurt.put(Nutrient.VITAMIN_A, nutrientDetails(2.0));
        nutritionForYogurt.put(Nutrient.VITAMIN_B12, nutrientDetails(0.75));
        nutritionForYogurt.put(Nutrient.VITAMIN_B6, nutrientDetails(0.063));
        nutritionForYogurt.put(Nutrient.VITAMIN_C, nutrientDetails(0.0));
        nutritionForYogurt.put(Nutrient.VITAMIN_D, nutrientDetails(0.0));
        nutritionForYogurt.put(Nutrient.VITAMIN_E, nutrientDetails(0.01));
        nutritionForYogurt.put(Nutrient.VITAMIN_K, nutrientDetails(0.0));
                
        nutritionPerPortion.put("Yogurt,greek,whole milk,plain", nutritionForYogurt);
        
        HashMap<Nutrient, HashMap<String, Object>> nutritionForBread = new HashMap();
        
        nutritionForBread.put(Nutrient.ZINC, nutrientDetails(0.74)); // mg
        nutritionForBread.put(Nutrient.IRON, nutrientDetails(3.61)); // mg
        nutritionForBread.put(Nutrient.CALCIUM, nutrientDetails(144)); // mg
        nutritionForBread.put(Nutrient.CHOLINE, nutrientDetails(14.6)); // mg
        nutritionForBread.put(Nutrient.COPPER, nutrientDetails(101)); // mcg
        nutritionForBread.put(Nutrient.FOLATE, nutrientDetails(111)); // mcg
        nutritionForBread.put(Nutrient.MAGNESIUM, nutrientDetails(23)); // mg
        nutritionForBread.put(Nutrient.NIACIN, nutrientDetails(4.78)); // mg
        nutritionForBread.put(Nutrient.PHOSPHORUS, nutrientDetails(98)); // mg
        nutritionForBread.put(Nutrient.POTASSIUM, nutrientDetails(126)); // mg
        nutritionForBread.put(Nutrient.RIBOFLAVIN, nutrientDetails(0.243)); // mg
        nutritionForBread.put(Nutrient.SELENIUM, nutrientDetails(22)); // mcg
        nutritionForBread.put(Nutrient.SODIUM, nutrientDetails(0.49)); // g
        nutritionForBread.put(Nutrient.THIAMIN, nutrientDetails(0.533)); // mg
        nutritionForBread.put(Nutrient.VITAMIN_A, nutrientDetails(0)); // mcg
        nutritionForBread.put(Nutrient.VITAMIN_B12, nutrientDetails(0)); // mcg
        nutritionForBread.put(Nutrient.VITAMIN_B6, nutrientDetails(0.087)); // mg
        nutritionForBread.put(Nutrient.VITAMIN_C, nutrientDetails(0)); // mg
        nutritionForBread.put(Nutrient.VITAMIN_D, nutrientDetails(0)); // mcg
        nutritionForBread.put(Nutrient.VITAMIN_E, nutrientDetails(0.22)); // mg
        nutritionForBread.put(Nutrient.VITAMIN_K, nutrientDetails(0.2)); // mcg
                
        nutritionPerPortion.put("Bread,white", nutritionForBread);
        
        HashMap<Nutrient, HashMap<String, Object>> nutritionForHavarti = new HashMap();
        
        nutritionForHavarti.put(Nutrient.ZINC, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.IRON, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.CALCIUM, nutrientDetails(714)); // mg
        nutritionForHavarti.put(Nutrient.CHOLINE, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.COPPER, nutrientDetails(0)); // mcg
        nutritionForHavarti.put(Nutrient.FOLATE, nutrientDetails(0)); // mcg
        nutritionForHavarti.put(Nutrient.MAGNESIUM, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.NIACIN, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.PHOSPHORUS, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.POTASSIUM, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.RIBOFLAVIN, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.SELENIUM, nutrientDetails(0)); // mcg
        nutritionForHavarti.put(Nutrient.SODIUM, nutrientDetails(.75)); // g
        nutritionForHavarti.put(Nutrient.THIAMIN, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.VITAMIN_A, nutrientDetails(0)); // mcg
        nutritionForHavarti.put(Nutrient.VITAMIN_B12, nutrientDetails(0)); // mcg
        nutritionForHavarti.put(Nutrient.VITAMIN_B6, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.VITAMIN_C, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.VITAMIN_D, nutrientDetails(0)); // mcg
        nutritionForHavarti.put(Nutrient.VITAMIN_E, nutrientDetails(0)); // mg
        nutritionForHavarti.put(Nutrient.VITAMIN_K, nutrientDetails(0)); // mcg
                
        nutritionPerPortion.put("Havarti", nutritionForHavarti);
    }
    
    public String name() { return name; }
    
    public double nutritionPerPortion(Nutrient nutrient) { 
        return (double)nutritionPerPortion.get(name).get(nutrient).get("amount");
    }
    
    private HashMap<String, Object> nutrientDetails(double amount) {
        // amount per 100g is in same unit as enum Nutrient unit
        HashMap<String, Object> details = new HashMap();
        
        details.put("amount", amount);
        
        return details;
    }
}
