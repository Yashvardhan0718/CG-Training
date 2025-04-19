package week4.day5.level2.main;

public class password {
    public boolean isValid(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}

