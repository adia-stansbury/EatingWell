/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;

//import java.util.stream;
import java.util.ArrayList;
/**
 *
 * @author Adia
 */
public class Intake {
    ArrayList meals = new ArrayList();
    
    Intake(ArrayList meals) {
        this.meals = meals;
    }
    
//    public double forNutrient(Nutrient nutrient) {
//        double sum = meals.stream()
//                          .mapToDouble(meal -> meal.nutrientAmount(nutrient))
//                          .sum();
//        return sum;
//    }
}
