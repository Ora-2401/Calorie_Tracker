/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calorietracker;

/**
 *
 * @author ratil
 */
import java.util.Scanner; 

public class CalorieTracker { 

    public static void main(String[] args) { 

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your daily calorie intake: ");
            
            String input = scanner.nextLine();
            
            
            
            if (isNumeric(input)) {
                
                int calories = Integer.parseInt(input);
                
                
                
                if (calories < 1500) {
                    
                    System.out.println("Calorie Intake: Below recommended range.");
                    
                } else if (calories <= 5000) {
                    
                    System.out.println("Calorie Intake: Within recommended range.");
                    
                } else {
                    
                    System.out.println("Calorie Intake: Above recommended range.");
                    
                }
                
            } else {
                
                System.out.println("Error: Please enter a numeric value.");
                
            }
        } 

    } 

 

    public static boolean isNumeric(String str) { 

        if (str == null || str.trim().isEmpty()) { 

            return false; 

        } 

 

        try { 

            Integer.valueOf(str.trim()); 

            return true; 

        } catch (NumberFormatException e) { 

            return false; 

        } 

    } 

}
