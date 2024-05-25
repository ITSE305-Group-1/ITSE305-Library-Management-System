package main.java;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    // Method for user authentication
    public boolean authenticate(String username, String password) {
        User user = new User(this.username, this.password);
        return user != null && user.getPassword().equals(password) && user.getUsername().equals(username);
    }

}