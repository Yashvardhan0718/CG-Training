package week4.day5.level2.main;

public class user {
    public void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) throw new IllegalArgumentException("Invalid username");
        if (!email.matches("^\\S+@\\S+\\.\\S+$")) throw new IllegalArgumentException("Invalid email");
        if (password.length() < 6) throw new IllegalArgumentException("Password too short");
    }
}
