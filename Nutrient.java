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
    ZINC (16, 40.00, "mg"),
    IRON (23.63, 45.00, "mg"),
    CALCIUM (1000, 2500.00, "mg"), 
    MAGNESIUM (320, 350.00, "mg"),
    PHOSPHORUS (700, 4000.00, "mg"),
    POTASSIUM (4.7, null, "g"),
    COPPER (900, 10000.00, "mcg"),
    MANGANESE (1.8, 11.00, "mg"),
    SELENIUM (55, 400.00, "mcg"),
    THIAMIN (1.1, null, "mg"),
    RIBOFLAVIN (1.1, null, "mg"),
    VITAMIN_A (700, 3000.00, "mcg"), 
    VITAMIN_C (75, 2000.00, "mg"),
    VITAMIN_D (5, 50.00, "mcg"),
    VITAMIN_E (15, 1000.00, "mg"),
    VITAMIN_K (90, null, "mcg"),
    NIACIN (14, 35.00, "mg"),
    VITAMIN_B6 (1.3, 100.00, "mg"),
    VITAMIN_B12 (2.4, null, "mcg"),
    BIOTIN (30, null, "mcg"),
    FOLATE (400, 1000.00, "mcg"),
    CHOLINE (425, 3500.00, "mg"),
    PANTOTHENIC_ACID (5, null, "mg"),
    CHROMIUM (25, null, "mcg"),
    FLUORIDE (3, 10.00, "mg"),
    IODINE (150, 1100.00, "mcg"),
    MOLYBDENUM (45, 2000.00, "mcg"),
    SODIUM (1.5, 2.3, "g"),
    CHLORIDE (2.3, 3.6, "g");

    
    public final double recommendedIntake;
    public final Double upperLimit; 
    public final String unit;
    
    Nutrient(double recommendedDailyIntake, Double dailyUpperLimit, String unit) {
        this.recommendedIntake = recommendedDailyIntake;
        this.upperLimit = dailyUpperLimit;
        this.unit = unit;
    }
}
