import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = input.nextInt();

        while(counter != 0){
            System.out.println(counter--);
        }

        System.out.println("rocket launched....!");
    }
}