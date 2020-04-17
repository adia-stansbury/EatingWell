/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.AbstractMap;
import java.util.ArrayList;

/**
 *
 * @author Adia
 */
public class Meal {
    ArrayList<MealFood> mealFoods = new ArrayList();
   
    Meal(ArrayList mealFoods) { 
        this.mealFoods = mealFoods;
    }
    
    public double nutrientAmount(Nutrient nutrient) {
        double sum = mealFoods.stream()
                          .mapToDouble(food -> food.zincAmount())
                          .sum();
        return sum;
    }
}