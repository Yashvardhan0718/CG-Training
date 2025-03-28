import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        
        if(num > 0){
            for (int i=1; i<= num; i++){
                if(i % 2 == 0){
                    System.out.println(i+" number is even");
                } else{
                    System.out.println(i+" number is ODD");
                }
            }
        }
    }
}