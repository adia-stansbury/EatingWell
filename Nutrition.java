/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;
import java.util.EnumMap;
import java.util.ArrayList;

/**
 *
 * @author Adia
 */
public class Nutrition {
    double intake;
    Nutrient nutrient;

    Nutrition(double intake, Nutrient nutrient) {
        this.intake = intake;
        this.nutrient = nutrient;
    }
    
    public boolean isAbnormalIntake() {
        if (intake < nutrient.recommendedIntake || intake > nutrient.upperLimit) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Abnormal intakes: "); 
        double intake;
        Nutrition nutrition;
        Meal meal;
        ArrayList mealFoods = new ArrayList();
        Food yogurt;
        yogurt = new Food("Yogurt,Greek,Whole Milk,Plain");
        MealFood mealWithYogurt;
        mealWithYogurt = new MealFood(yogurt, 245.00);
        mealFoods.add(mealWithYogurt);
        meal = new Meal(mealFoods);
        for (Nutrient nutrient : Nutrient.values()) {
            intake = meal.nutrientAmount(nutrient);
            nutrition = new Nutrition(intake, nutrient);
            if (nutrition.isAbnormalIntake()) {
                System.out.println(nutrient + ": " + intake + " " + yogurt.nutrientUnitName(nutrient)+ " (" + nutrient.recommendedIntake + " - " + nutrient.upperLimit + " " + nutrient.unit + ")");
            };
        } 
    }
}