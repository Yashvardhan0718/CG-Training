package week4.day5.level1;

public class ssn {
    public static void main(String[] args) {
        String input = "My SSN is 123-45-6789.";
        boolean isValid = input.matches(".*\\b\\d{3}-\\d{2}-\\d{4}\\b.*");
        System.out.println(isValid ? "Valid SSN" : "Invalid SSN");
    }
}

