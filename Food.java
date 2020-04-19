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
    
    //            "For 1 cup of whole milk plain greek yogurt, zinc (mg): "
//            + percentOfRDA(1.27,8) + "% RDA, iron (mg): "
//            + percentOfRDA(0,18) + "% RDA, calcium (mg): "
//            + percentOfRDA(245,1000) + "% RDA, magnesium (mg): "
//            + percentOfRDA(27,310) + "% RDA, phosphorus (mg): "
//            + percentOfRDA(331,700) + "% RDA, potassium (mg): "
//            + percentOfRDA(345,4700) + "% RDA, copper (mg): "
//            + percentOfRDA(0.042,0.9) + "% RDA, manganese (mg): "
//            + percentOfRDA(0,1.8) + "% RDA, selenium (mcg): "
//            + percentOfRDA(23.8,55) + "% RDA, vitamin A (mg): "
//            + percentOfRDA(0,700) + "% RDA, vitamin E (mg): "
//            + percentOfRDA(0,15) + "% RDA, vitamin D (IU): "
//            + percentOfRDA(0,600) + "% RDA, vitamin C (mg): "
//            + percentOfRDA(0,75) + "% RDA, thiamin (mg): "
//            + percentOfRDA(0.056,1.1) + "% RDA, riboflavin (mg): "
//            + percentOfRDA(0.681,1.1) + "% RDA, niacin (mg): "
//            + percentOfRDA(0.51,14) + "% RDA, vitamin B6 (mg): "
//            + percentOfRDA(0.154,1.3) + "% RDA, vitamin B12 (mcg): "
//            + percentOfRDA(1.84,2.4) + "% RDA, choline (mg): "
//            + percentOfRDA(37,425) + "% RDA, vitamin K (mcg): "
//            + percentOfRDA(0,90) + "% RDA, folate (mcg): "
//            + percentOfRDA(12.2,400) + "% RDA"
           
    
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
