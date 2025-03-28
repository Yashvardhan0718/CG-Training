import java.util.*;

public class Main{

    static int SimpleInterest(int principal, int rate , int time){

        int SimpleInterest = (principal*rate*time)/100;
        return SimpleInterest;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();


        int SI = Main.SimpleInterest(principal, rate, time);
        System.out.println(SI);
    }

}
