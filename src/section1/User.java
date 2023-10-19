package section1;

public class User {
    private String username; // Creating the attributes
    private String password; // Encapsulating the attributes

    public User(String username, String password) { // Creating the contructor
        this.username = username;
        this.password = password;
    }

    public String getUsername() { // Getter for the username
        return username;
    }

    public void setUsername(String username) { // Setter for the username
        this.username = username;
    }

    public String getPassword() { // Getter for the password
        return password;
    }

    public void setPassword(String password) { // Setter for the password
        this.password = password;
    }
}
