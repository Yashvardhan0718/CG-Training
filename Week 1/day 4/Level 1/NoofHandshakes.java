import java.util.*;

public class Main{

    public int handshakes(int n){

        int noOfHandshakes = (n*(n-1))/2;
        return noOfHandshakes;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Main obj = new Main();


        System.out.println(obj.handshakes(n));
    }

}