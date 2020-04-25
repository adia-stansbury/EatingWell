/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adia.nutritionalreportapp;

/**
 *
 * @author Adia
 */
public enum Nutrient {
    // Nutrients in Part 3 of DRI
    ZINC (16, 40.00, "mg", 1095);
//    IRON (23.63, 45.00, "mg"),
//    CALCIUM (1000, 2500.00, "mg"), 
//    MAGNESIUM (320, 350.00, "mg"),
//    PHOSPHORUS (700, 4000.00, "mg"),
//    POTASSIUM (4700, 4700.00, "mg"), 
//    COPPER (900, 10000.00, "mcg"),
//    SELENIUM (55, 400.00, "mcg"),
//    THIAMIN (1.1, 1.1, "mg"),
//    RIBOFLAVIN (1.1, 1.1, "mg"),
//    VITAMIN_A (700, 3000.00, "mcg"), 
//    VITAMIN_C (75, 2000.00, "mg"),
//    VITAMIN_D (5, 50.00, "mcg"),
//    VITAMIN_E (15, 1000.00, "mg"),
//    VITAMIN_K (90, 90, "mcg"),
//    NIACIN (14, 35.00, "mg"),
//    VITAMIN_B6 (1.3, 100.00, "mg"),
//    VITAMIN_B12 (2.4, 2.4, "mcg"),
//    FOLATE (400, 1000.00, "mcg"),
//    CHOLINE (425, 3500.00, "mg"),
//    SODIUM (1.5, 2.3, "g");

    
    public final double recommendedIntake;
    public final double upperLimit; 
    public final String unit;
    public final int id;
    
    Nutrient(double recommendedDailyIntake, double dailyUpperLimit, String unit, int id) {
        this.recommendedIntake = recommendedDailyIntake;
        this.upperLimit = dailyUpperLimit;
        this.unit = unit;
        this.id = id;
    }
}
