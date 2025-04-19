package week4.day5.level1;

public class color {
    public static void main(String[] args) {
        String hex = "#FFA500";
        boolean isValid = hex.matches("^#[0-9a-fA-F]{6}$");
        System.out.println(isValid ? "Valid" : "Invalid");
    }
}
