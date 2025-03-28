import java.util.*;

public class Main {

    public double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);
        double[] result = new double[3];

        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);

        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        double angle = sc.nextDouble();

        double[] result = obj.calculateTrigonometricFunctions(angle);

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

}

