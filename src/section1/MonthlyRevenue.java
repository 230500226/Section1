/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1;

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
 
}
