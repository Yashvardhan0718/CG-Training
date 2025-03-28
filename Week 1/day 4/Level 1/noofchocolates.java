import java.util.*;

public class Main {

    public void smallLarge(int children, int chocolates) {

        int rem = chocolates%children;
        int quotient = chocolates/children;
        System.out.println(rem);
        System.out.println(quotient);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int children = sc.nextInt();
        int chocolates = sc.nextInt();
        obj.smallLarge(children,chocolates);
    }

}