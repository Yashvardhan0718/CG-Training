
import java.util.Scanner;

public class Main {

    public String youngest(String[] names, int[] age){
        int youngest = 99;
        int i;
        int youngIndex =0;
        for( i = 0; i<3; i++){
            if(age[i]<youngest){
                youngest = age[i];
                youngIndex = i;
            }
        }
        return names[youngIndex];
    }
    public String tallest(String[] names,int[] height){
        int tallHeight = 0;
        int i;
        int heightIndex =0;

        for( i = 1; i<3; i++){
            if(height[i]>tallHeight){
                tallHeight = height[i];
                heightIndex =i;
            }
        }
        return names[heightIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();



        int[] age = new int[3];
        for(int i=0;i<3;i++){
            age[i] = sc.nextInt();
        }

        int[] height = new int[3];
        for(int i=0;i<3;i++){
            height[i] = sc.nextInt();
        }

        String[] names = {"Amar", "Akbar", "Antony"};

        System.out.println(obj.youngest(names,age));


        System.out.println(obj.tallest(names,height));

    }
}

