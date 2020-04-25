/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 *
 * @author Adia
 */
public class Food {
    public static final double GRAM_PORTION_WEIGHT = 100.00;
    String id;
    public static HashMap<String, HashMap<Nutrient, HashMap<String, Double>>> foods = new HashMap();
           
    Food(String id) throws IOException {
        this.id = id;
        
        HashMap<Nutrient, HashMap<String, Double>> nutritionForYogurt = new HashMap();
        
        nutritionForYogurt.put(Nutrient.ZINC, nutrientDetails(0.52));
//        nutritionForYogurt.put(Nutrient.IRON, nutrientDetails(0));
//        nutritionForYogurt.put(Nutrient.CALCIUM, nutrientDetails(100.00));
//        nutritionForYogurt.put(Nutrient.CHOLINE, nutrientDetails(15.1));
//        nutritionForYogurt.put(Nutrient.COPPER, nutrientDetails(17.0));
//        nutritionForYogurt.put(Nutrient.FOLATE, nutrientDetails(5.0));
//        nutritionForYogurt.put(Nutrient.MAGNESIUM, nutrientDetails(11.0));
//        nutritionForYogurt.put(Nutrient.NIACIN, nutrientDetails(0.208));
//        nutritionForYogurt.put(Nutrient.PHOSPHORUS, nutrientDetails(135.0));
//        nutritionForYogurt.put(Nutrient.POTASSIUM, nutrientDetails(141.0));
//        nutritionForYogurt.put(Nutrient.RIBOFLAVIN, nutrientDetails(0.278));
//        nutritionForYogurt.put(Nutrient.SELENIUM, nutrientDetails(9.7));
//        nutritionForYogurt.put(Nutrient.SODIUM, nutrientDetails(0.035));
//        nutritionForYogurt.put(Nutrient.THIAMIN, nutrientDetails(0.023));
//        nutritionForYogurt.put(Nutrient.VITAMIN_A, nutrientDetails(2.0));
//        nutritionForYogurt.put(Nutrient.VITAMIN_B12, nutrientDetails(0.75));
//        nutritionForYogurt.put(Nutrient.VITAMIN_B6, nutrientDetails(0.063));
//        nutritionForYogurt.put(Nutrient.VITAMIN_C, nutrientDetails(0.0));
//        nutritionForYogurt.put(Nutrient.VITAMIN_D, nutrientDetails(0.0));
//        nutritionForYogurt.put(Nutrient.VITAMIN_E, nutrientDetails(0.01));
//        nutritionForYogurt.put(Nutrient.VITAMIN_K, nutrientDetails(0.0));
                
        foods.put("Yogurt,greek,whole milk,plain", nutritionForYogurt);
        
        HashMap<Nutrient, HashMap<String, Double>> nutritionForBread = new HashMap();
        
        nutritionForBread.put(Nutrient.ZINC, nutrientDetails(0.74)); // mg
//        nutritionForBread.put(Nutrient.IRON, nutrientDetails(3.61)); // mg
//        nutritionForBread.put(Nutrient.CALCIUM, nutrientDetails(144)); // mg
//        nutritionForBread.put(Nutrient.CHOLINE, nutrientDetails(14.6)); // mg
//        nutritionForBread.put(Nutrient.COPPER, nutrientDetails(101)); // mcg
//        nutritionForBread.put(Nutrient.FOLATE, nutrientDetails(111)); // mcg
//        nutritionForBread.put(Nutrient.MAGNESIUM, nutrientDetails(23)); // mg
//        nutritionForBread.put(Nutrient.NIACIN, nutrientDetails(4.78)); // mg
//        nutritionForBread.put(Nutrient.PHOSPHORUS, nutrientDetails(98)); // mg
//        nutritionForBread.put(Nutrient.POTASSIUM, nutrientDetails(126)); // mg
//        nutritionForBread.put(Nutrient.RIBOFLAVIN, nutrientDetails(0.243)); // mg
//        nutritionForBread.put(Nutrient.SELENIUM, nutrientDetails(22)); // mcg
//        nutritionForBread.put(Nutrient.SODIUM, nutrientDetails(0.49)); // g
//        nutritionForBread.put(Nutrient.THIAMIN, nutrientDetails(0.533)); // mg
//        nutritionForBread.put(Nutrient.VITAMIN_A, nutrientDetails(0)); // mcg
//        nutritionForBread.put(Nutrient.VITAMIN_B12, nutrientDetails(0)); // mcg
//        nutritionForBread.put(Nutrient.VITAMIN_B6, nutrientDetails(0.087)); // mg
//        nutritionForBread.put(Nutrient.VITAMIN_C, nutrientDetails(0)); // mg
//        nutritionForBread.put(Nutrient.VITAMIN_D, nutrientDetails(0)); // mcg
//        nutritionForBread.put(Nutrient.VITAMIN_E, nutrientDetails(0.22)); // mg
//        nutritionForBread.put(Nutrient.VITAMIN_K, nutrientDetails(0.2)); // mcg
                
        foods.put("Bread,white", nutritionForBread);
        
        HashMap<Nutrient, HashMap<String, Double>> nutritionForHavarti = new HashMap();
        
        nutritionForHavarti.put(Nutrient.ZINC, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.IRON, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.CALCIUM, nutrientDetails(714)); // mg
//        nutritionForHavarti.put(Nutrient.CHOLINE, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.COPPER, nutrientDetails(0)); // mcg
//        nutritionForHavarti.put(Nutrient.FOLATE, nutrientDetails(0)); // mcg
//        nutritionForHavarti.put(Nutrient.MAGNESIUM, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.NIACIN, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.PHOSPHORUS, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.POTASSIUM, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.RIBOFLAVIN, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.SELENIUM, nutrientDetails(0)); // mcg
//        nutritionForHavarti.put(Nutrient.SODIUM, nutrientDetails(.75)); // g
//        nutritionForHavarti.put(Nutrient.THIAMIN, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.VITAMIN_A, nutrientDetails(0)); // mcg
//        nutritionForHavarti.put(Nutrient.VITAMIN_B12, nutrientDetails(0)); // mcg
//        nutritionForHavarti.put(Nutrient.VITAMIN_B6, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.VITAMIN_C, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.VITAMIN_D, nutrientDetails(0)); // mcg
//        nutritionForHavarti.put(Nutrient.VITAMIN_E, nutrientDetails(0)); // mg
//        nutritionForHavarti.put(Nutrient.VITAMIN_K, nutrientDetails(0)); // mcg
                
        foods.put("Havarti", nutritionForHavarti);
        
        foods.put("539846", nutrition()); // Havarti
    }
    
    public double nutritionPerPortion(Nutrient nutrient) throws IOException { 
        if (!foods.containsKey(id)) {
            foods.put(id, nutrition());
        } 
        // TODO: wait for response
        return (double)foods.get(id).get(nutrient).get("amount");
    }
    
    private HashMap<Nutrient, HashMap<String, Double>> nutrition() throws ProtocolException, IOException {
        HashMap<Nutrient, HashMap<String, Double>> nutrition = new HashMap();        
        
        for (Nutrient nutrient : Nutrient.values()) {
            // get nutrient amount for 100g of food via API
            // curl https://api.nal.usda.gov/fdc/v1/food/######?api_key=DEMO_KEY
            // response = { "foodNutrients":["type": "FoodNutrient","nutrient":{"id":1003,"name":"Protein","unitName":"g"},"amount":9}
          
            // all amounts are in unit for nutrient table per 100g of food
            nutrition.put(nutrient, nutrientDetails(nutrientAmount()));
        };
        
        return nutrition;
    }
    
//    private double nutrientAmount() {
        // TODO
//        for ( HashMap foodNutrient : foodData.get("foodNutrients")) {
//            if (foodNutrient.get("type") == "FoodNutrient") {
//                foodNutrient.get("nutrient").get("id"); 
//                foodNutrient.get("amount");
//            }
//        }
//    }
    
//    private JSON foodData() {
//        TODO: return jsonified foodData
    // https://www.java67.com/2016/10/3-ways-to-convert-string-to-json-object-in-java.html
//    }
    
    private String foodData(String FoodIdAPI) throws MalformedURLException, ProtocolException, IOException {
            URL getFoodDetailsURL = new URL("https://api.nal.usda.gov/fdc/v1/food/539846?api_key=DEMO_KEY");
            HttpURLConnection connection = (HttpURLConnection) getFoodDetailsURL.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                return response.toString();
            } else { return ""; }
    }
    
    private HashMap<String, Double> nutrientDetails(double amount) {
        // amount per 100g is in same unit as enum Nutrient unit
        HashMap<String, Double> details = new HashMap();
        
        details.put("amount", amount);
        
        return details;
    }
}
