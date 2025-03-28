import java.util.*;

public class Main {

    public void smallLarge(int num1, int num2) {

        int rem = num1%num2;
        int quotient = num1/num2;
        System.out.println(rem);
        System.out.println(quotient);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        obj.smallLarge(num1,num2);
    }

}



