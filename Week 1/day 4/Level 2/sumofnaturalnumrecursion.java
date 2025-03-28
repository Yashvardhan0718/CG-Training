import java.util.*;

public class Main {

    public int recurssion(int num){
        int sum =0;
        for(int i=1;i<=num;i++){
            sum+= i;
        }
        return sum;
    }

    public int formula(int num){
        int add = num*(num+ 1)/2;
        return add;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int num = sc.nextInt();

        System.out.println("Sum using recurssion: "+ obj.recurssion(num));
        System.out.println("Sum using formula: "+ obj.formula(num));
        if(obj.recurssion(num) == obj.formula(num)){
            System.out.println(" Both methods are correct");
        }

    }

}