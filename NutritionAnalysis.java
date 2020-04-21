/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;
import java.util.ArrayList;

/**
 *
 * @author Adia
 */
public class NutritionAnalysis {
    double intake;
    Nutrient nutrient;

    NutritionAnalysis(double intake, Nutrient nutrient) {
        this.intake = intake;
        this.nutrient = nutrient;
    }
    
    public boolean isAbnormalIntake() {
        return (intake < nutrient.recommendedIntake) || (intake > nutrient.upperLimit);
    }
 
    public static void main(String[] args) {
        System.out.println("Abnormal intakes: "); 
        
        ArrayList<FoodIntake> foodsIntake = new ArrayList();
        foodsIntake.add(new FoodIntake(new Food("Yogurt,greek,whole milk,plain"), 245));
        foodsIntake.add(new FoodIntake(new Food("Bread,white"), 98));

        double intake;
        NutritionAnalysis nutritionAnalysis;
        for (Nutrient nutrient : Nutrient.values()) {
            intake = foodsIntake
                    .stream()
                    .mapToDouble(foodIntake -> foodIntake.nutrientAmount(nutrient))
                    .sum();

            nutritionAnalysis = new NutritionAnalysis(intake, nutrient);
            
            if (nutritionAnalysis.isAbnormalIntake()) {
                System.out.println(nutrient + ": " + intake + " (" + nutrient.recommendedIntake + " - " + nutrient.upperLimit + ")" + " " + nutrient.unit);
            };
        } 
        
        // manually calc zinc amount for yogurt, bread: 1.27 + 0.74 mg(100 instad of 98)
    }
}