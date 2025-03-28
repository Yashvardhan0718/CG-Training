import java.util.*;

public class Main {

    public static int[] factors(int num){
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i ==0){
                count++;
            }
        }

        int[] factors = new int[count];
        int index =0;
        for(int i=1;i<=num;i++){
            if(num%i == 0){
                factors[index++] = i;
            }
        }
        return factors;
    }
    public int sumOfFactors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum += factors[i];
        }
        return sum;
    }
    public int productOfFactors(int[] factors){
        int product=1;
        for(int i=0;i<factors.length;i++){
            product *= factors[i];
        }
        return product;
    }

    public int sumOfSquares(int[] factors){
        int sum =0;
        for(int i=0;i<factors.length;i++){
            sum = sum + factors[i]*factors[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int num = sc.nextInt();

        int[] factors = factors(num);
        System.out.println("Factors of given number : ");
        for(int i=0;i<factors.length;i++){
            System.out.println(factors[i]);
        }

        System.out.println("Sum of factors : " + obj.sumOfFactors(factors));
        System.out.println("Product of factors : " + obj.productOfFactors(factors));
        System.out.println("Sum of Squares of factors: " + obj.sumOfSquares(factors));
    }

}