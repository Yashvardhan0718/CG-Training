package week4.day5.level1;

public class ip {
    public static void main(String[] args) {
        String ip = "192.168.1.1";
        String pattern = "^((25[0-5]|2[0-4]\\d|1?\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|1?\\d{1,2})$";
        boolean isValid = ip.matches(pattern);
        System.out.println(isValid ? "Valid IP" : "Invalid IP");
    }
}

