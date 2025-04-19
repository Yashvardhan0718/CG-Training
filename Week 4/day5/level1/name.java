package week4.day5.level1;

public class name {
    public static void main(String[] args) {
        String username = "user_123";
        boolean isValid = username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
        System.out.println(isValid ? "Valid" : "Invalid");
    }
}
