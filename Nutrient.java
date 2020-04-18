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
    ZINC (8, 40, "mg"),
    IRON (18, 45, "mg");
    
    public final double recommendedIntake;
    public final double upperLimit; //if none, perhaps default to infinity
    public final String unit;
    
    Nutrient(double recommendedDailyIntake, double dailyUpperLimit, String unit) {
        this.recommendedIntake = recommendedDailyIntake;
        this.upperLimit = dailyUpperLimit;
        this.unit = unit;
    }
    
}
        

//    static final double upperLimitVitaminA = 3000; // mcg
//    static final double upperLimitVitaminC = 2000; // mg
//    static final double upperLimitVitaminD = 50; // mcg
//    static final double upperLimitVitaminE = 1000; // mg
//    static final double upperLimitNiacin = 35; // mg
//    static final double upperLimitVitaminB6 = 100; // mg
//    static final double upperLimitFolate = 1000; //mcg
//    static final double upperLimitCholine = 3.5; // g
    // zinc (mg): "
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
