package com.company;

public class Overloading {
    public static void main(String[] args) {
        calcFeetAndINchesToCentimeters(2, 11);
        System.out.println(calcFeetAndINchesToCentimeters(38));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore( int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore( ){
        System.out.println("Unnamed player scored  and no score ");
    }

    public static double calcFeetAndINchesToCentimeters(double feet, double inches) {
        if( feet >= 0 && (inches >= 0 && inches <= 12)){
            double totalCentimeters = (feet * 12.00) * 2.54;
            totalCentimeters += inches * 2.54;
            System.out.println("Total centimeters: " + totalCentimeters);
            return totalCentimeters;
        }
        return -1;
    }

    public static double calcFeetAndINchesToCentimeters(double inches) {
        if (inches >= 0){
            double totalCentimeters = Math.floor( inches * 2.54);
            System.out.println("Number of feet from inches: " + inchesInFeet(inches));
            return totalCentimeters;
        }
        return -1;
    }

    public static double inchesInFeet(double inches){
        return Math.floor(inches / 12.00);
    }

}
