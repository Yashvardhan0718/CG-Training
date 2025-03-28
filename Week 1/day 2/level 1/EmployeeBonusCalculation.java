import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        
        if(yearsOfService > 5){
            salary = (salary * 5)/100;
        }
        
        System.out.println("Bonus amount: "+salary);
    }
}