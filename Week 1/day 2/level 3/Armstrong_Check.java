import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        boolean isArmstrong = false;
        
        int temp = num;
        int res = 0;
        int add = 0;
        
        while(temp != 0){
            res = temp % 10;
            temp /= 10;
            add = (res * res * res) + add;
        }
        if (add == num){
            isArmstrong = true;
        }
        System.out.println("The number is armstrong number: " + isArmstrong);
    }
}