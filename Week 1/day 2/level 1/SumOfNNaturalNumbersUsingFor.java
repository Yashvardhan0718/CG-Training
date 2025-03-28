import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int sum = (num*(num+1))/2;
        int count = 0;
        
        if (num > 0){
            for(int i = 0; i<=num; i++){
                count += i;
            }
        }
        
        if (sum == count){
            System.out.println("Result using formula: "+ sum + " and using while loop is: "+ count);
        }
    }
}