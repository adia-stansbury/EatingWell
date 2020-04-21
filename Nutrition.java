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
public class Nutrition {
    double intake;
    Nutrient nutrient;

    Nutrition(double intake, Nutrient nutrient) {
        this.intake = intake;
        this.nutrient = nutrient;
    }
    
    public boolean isAbnormalIntake() {
        return (intake < nutrient.recommendedIntake) || (intake > nutrient.upperLimit);
    }
    
    public static void main(String[] args) {
        System.out.println("Abnormal intakes: "); 
        double intake;
        Nutrition nutrition;
        Meal meal;
        ArrayList mealFoods = new ArrayList();
        
        Food yogurt;
        yogurt = new Food("Yogurt,greek,whole milk,plain");
        MealFood mealWithYogurt;
        mealWithYogurt = new MealFood(yogurt, 245.00);
        mealFoods.add(mealWithYogurt);
        
        Food bread;
        bread = new Food("Bread,white");
        MealFood mealWithBread;
        mealWithBread = new MealFood(bread, 98);
        mealFoods.add(mealWithBread);
        
        meal = new Meal(mealFoods);
        
        for (Nutrient nutrient : Nutrient.values()) {
            intake = meal.nutrientAmount(nutrient);
            nutrition = new Nutrition(intake, nutrient);
            if (nutrition.isAbnormalIntake()) {
                System.out.println(nutrient + ": " + intake + " (" + nutrient.recommendedIntake + " - " + nutrient.upperLimit + ")" + " " + nutrient.unit);
            };
        } 
    }
}