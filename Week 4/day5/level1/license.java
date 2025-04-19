package week4.day5.level1;

public class license {
    public static void main(String[] args) {
        String plate = "AB1234";
        boolean isValid = plate.matches("^[A-Z]{2}\\d{4}$");
        System.out.println(isValid ? "Valid" : "Invalid");
    }
}
