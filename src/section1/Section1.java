/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section1;

import java.util.Scanner;

/**
 *
 * @author 230500226
 */
public class Section1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // MonthlyRevenue.run();

        Scanner scanner = new Scanner(System.in);

        AuthenticationSytem authenticate = new AuthenticationSytem(); // Creates an authentication object

        System.out.println("Please register a new user");

            System.out.println("Enter a username");
            String username = scanner.nextLine(); // User enters a username

            System.out.println("Enter a password");
            String password = scanner.nextLine(); // User enters a password
        
        authenticate.register(username, password); // Call the register method to add a user object to the users map
        
        System.out.println("Please login: ");
            
            System.out.print("Enter username: ");
            username = scanner.nextLine();  
           
            System.out.print("Enter password: ");
            password = scanner.nextLine();

        authenticate.login(username, password); // Calls the login method to check if the users details matches the details in the users map
    }
    
}
