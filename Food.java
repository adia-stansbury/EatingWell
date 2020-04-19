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
        
        HashMap<String, Object> zincDetails = new HashMap();
        zincDetails.put("amount", 0.52);
        zincDetails.put("unitName", "mg");
        nutrients.put(Nutrient.ZINC, zincDetails);
        
        HashMap<String, Object> ironDetails = new HashMap();
        ironDetails.put("amount", 0.00);
        ironDetails.put("unitName", "mg");
        nutrients.put(Nutrient.IRON, ironDetails);
        
        HashMap<String, Object> calciumDetails = new HashMap();
        calciumDetails.put("amount", 100.00);
        calciumDetails.put("unitName", "mg");
        nutrients.put(Nutrient.CALCIUM, calciumDetails);
        
        nutrients.put(Nutrient.BIOTIN, nutrientDetails(null, null));
        nutrients.put(Nutrient.CHLORIDE, nutrientDetails(null, null));
        nutrients.put(Nutrient.CHOLINE, nutrientDetails(15.1, "mg"));
        nutrients.put(Nutrient.CHROMIUM, nutrientDetails(null, null));
        nutrients.put(Nutrient.COPPER, nutrientDetails(0.017, "mg"));
        nutrients.put(Nutrient.FLUORIDE, nutrientDetails(null, null));
        nutrients.put(Nutrient.FOLATE, nutrientDetails(5.0, "mcg"));
        nutrients.put(Nutrient.IODINE, nutrientDetails(null, null));
        nutrients.put(Nutrient.MAGNESIUM, nutrientDetails(11.0, "mg"));
        nutrients.put(Nutrient.MANGANESE, nutrientDetails(null, null));
        nutrients.put(Nutrient.MOLYBDENUM, nutrientDetails(null, null));
        nutrients.put(Nutrient.NIACIN, nutrientDetails(0.208, "mg"));
        nutrients.put(Nutrient.PANTOTHENIC_ACID, nutrientDetails(null, null));
        nutrients.put(Nutrient.PHOSPHORUS, nutrientDetails(135.0, "mg"));
        nutrients.put(Nutrient.POTASSIUM, nutrientDetails(141.0, "mg"));
        nutrients.put(Nutrient.RIBOFLAVIN, nutrientDetails(0.278, "mg"));
        nutrients.put(Nutrient.SELENIUM, nutrientDetails(9.7, "mcg"));
        nutrients.put(Nutrient.SODIUM, nutrientDetails(35.0, "mg"));
        nutrients.put(Nutrient.THIAMIN, nutrientDetails(0.023, "mg"));
        nutrients.put(Nutrient.VITAMIN_A, nutrientDetails(2.0, "mcg"));
        nutrients.put(Nutrient.VITAMIN_B12, nutrientDetails(0.75, "mcg"));
        nutrients.put(Nutrient.VITAMIN_B6, nutrientDetails(0.063, "mg"));
        nutrients.put(Nutrient.VITAMIN_C, nutrientDetails(0.0, "mg"));
        nutrients.put(Nutrient.VITAMIN_D, nutrientDetails(0.0, "mcg"));
        nutrients.put(Nutrient.VITAMIN_E, nutrientDetails(0.01, "mg"));
        nutrients.put(Nutrient.VITAMIN_K, nutrientDetails(0.0, "mcg"));
                
        nutritionPerPortion.put("Yogurt,Greek,Whole Milk,Plain", nutrients);
    }
    
    public HashMap foodDetails() {
        return nutritionPerPortion.get(name);
    }
    
    public String name() { return name; }
    
    public double nutritionPerPortion(Nutrient nutrient) { 
        return (Double)nutritionPerPortion.get(name).get(nutrient).get("amount");
    }
    
    public String nutrientUnitName(Nutrient nutrient) { 
        return (String)nutritionPerPortion.get(name).get(nutrient).get("unitName");
    }
    
    private HashMap<String, Object> nutrientDetails(Double amount, String unitName) {
        HashMap<String, Object> details = new HashMap();
        
        details.put("amount", amount);
        details.put("unitName", unitName);
        
        return details;
    }
}
