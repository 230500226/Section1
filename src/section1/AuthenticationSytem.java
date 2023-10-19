package section1;

import java.util.HashMap;

public class AuthenticationSytem {
    private HashMap<String, User> users;    // Encapsulate the user object in a HashMap

    public AuthenticationSytem(){ // Create the constructor
        this.users = new HashMap<>();
    }

    public void register(String username, String password){
        if (users.containsKey(username)){   // Checks for existing user in the map
            System.out.println("User already registered: " + username);
        } else {
            users.put(username, new User(username, password)); // Creates a new user objects and adds it to the map
            System.out.println("User " + username + " created successfully");
        }
    }

    public void login(String username, String password){
        User user = users.get(username);
        
        if (user != null && user.getPassword().equals(password)){
            System.out.println("User " + username + "has logged in successfully");
        } else {
            System.out.println(" Wrong username or password ");
        }
    }
}
