/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 230500226
 */
public class MonthlyRevenue {
    public static void run(){
        int[] arrRevenue = new int[30]; // Create the array

        for (int i = 0; i < arrRevenue.length; i++){
            arrRevenue[i] = (int)(Math.random()*100);
        
        } // Populate the array with 30 random numbers 
            System.out.println("The monthly paypment array is : ");
                for (int i = 0; i < arrRevenue.length; i++){
                    System.out.print(arrRevenue[i] + " ; " ); // Print the array
                }
            System.out.println("");
            System.out.println("The mean is: " + Mean(arrRevenue) ); // Print the Mean
            System.out.println("The median is: " + Median(arrRevenue) ); // Print the Median
            System.out.println("The mode is: " + Mode(arrRevenue) ); // Print the Mode
    }

    public static int Mean(int[] arrRevenue){
        if (arrRevenue.length == 0 ){ // If the array is empty there will be no mean or any other calculation
            return 0;
        }
        int sum = 0;

            for (int num : arrRevenue){ // For each loop to add every number in the array
                sum +=num;
            }
        
        return sum / arrRevenue.length;
    }
    
    public static int Median(int[] arrRevenue){
        if (arrRevenue.length == 0 ){
            return 0;
        }
        
        Arrays.sort(arrRevenue); // Sorts the array in ascending order

        if (arrRevenue.length %2 == 0){ // If the array has an even number of elements the median will be the average of the 2 numbers in the middle
            return (arrRevenue[(arrRevenue.length / 2)- 1] + arrRevenue[arrRevenue.length / 2]) / 2;
        } else {
            return arrRevenue[arrRevenue.length / 2]; // Or it returns the middle number for the median
        }
    }

    public static int Mode(int[] arrRevenue){
        if (arrRevenue.length == 0 ){
            return 0;
        }
        Map<Integer, Integer> countMap = new HashMap<>(); // Creates a hashmap
        for (int num : arrRevenue) { // For each loop to add every value in the array to the map then assigns a count value to record how many times the same value is read
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int mode = arrRevenue[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) { // for each loop to compare the maxCount value to the count value of every entry in the hashmap. The maxCount is update to the new key of the map if necessary
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }

}
