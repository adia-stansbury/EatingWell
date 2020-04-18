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
    public static HashMap<String, HashMap<Nutrient, HashMap<String, Object>>> nutrition = new HashMap();
           
    
    Food(String name) {
        this.name = name;
        
        HashMap<Nutrient, HashMap<String, Object>> nutrients = new HashMap();
        
        HashMap<String, Object> zincDetails = new HashMap();
        zincDetails.put("amount", 0.52);
        zincDetails.put("unitName", "mg");
        nutrients.put(Nutrient.ZINC, zincDetails);
        
        HashMap<String, Object> ironDetails = new HashMap();
        ironDetails.put("amount", 0.00);
        ironDetails.put("unitName", "mg");
        nutrients.put(Nutrient.IRON, ironDetails);
        
        nutrition.put("Yogurt,Greek,Whole Milk,Plain", nutrients);
    }
    
    public HashMap foodDetails() {
        return nutrition.get(name);
    }
    
    public String name() { return name; }
    
    public double nutritionPerPortion(Nutrient nutrient) { 
        return (Double)nutrition.get(name).get(nutrient).get("amount");
    }
    
    public String nutrientUnitName(Nutrient nutrient) { 
        return (String)nutrition.get(name).get(nutrient).get("unitName");
    }
}
