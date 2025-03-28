import java.util.Scanner;

public class Main {

    public boolean canStudentVote(int age) {
        boolean canVote = false;

        if(age>18){
            canVote = true;
        }else{
            canVote= false;
        }
        return canVote;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int[] age = new int[10];
        for(int i=0;i<10;i++){
            age[i] = sc.nextInt();
            System.out.println(obj.canStudentVote(age[i]));
        }
    }
}

