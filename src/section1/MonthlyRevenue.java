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
        System.out.println("The mean is: " + mean(arrRevenue) ); // Print the mean
        System.out.println("The median is: " + Median(arrRevenue) ); // Print the Median
        System.out.println("The mode is: " + Mode(arrRevenue) ); // Print the Mode
    }

    public static int mean(int[] arrRevenue){
        if (arrRevenue.length == 0 ){
            return 0;
        }
        int sum = 0;

            for (int num : arrRevenue){
                sum +=num;
            }
        
        return sum / arrRevenue.length;
    }
    
    public static int Median(int[] arrRevenue){
        if (arrRevenue.length == 0 ){
            return 0;
        }
        
        Arrays.sort(arrRevenue);

        if (arrRevenue.length %2 == 0){
            return (arrRevenue[arrRevenue.length / 2 - 1] + arrRevenue[arrRevenue.length / 2]) / 2;
        } else {
            return arrRevenue[arrRevenue.length / 2];
        }
    }

    public static int Mode(int[] arrRevenue){
        if (arrRevenue.length == 0 ){
            return 0;
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arrRevenue) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int mode = arrRevenue[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }

}
