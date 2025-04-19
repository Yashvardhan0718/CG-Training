package week4.day5.level1;

public class card {
    public static void main(String[] args) {
        String card = "5123456789012345";
        boolean isVisa = card.matches("^4\\d{15}$");
        boolean isMaster = card.matches("^5\\d{15}$");
        System.out.println((isVisa || isMaster) ? "Valid Card" : "Invalid Card");
    }
}
