import java.util.*;
public class Main{

    public int[] generateOTP(int[] otp){

        for(int i=0;i<10;i++){
            otp[i] = (int)(Math.random()*1000000);
            System.out.println(otp[i]);
        }
        return otp;
    }
    public boolean isuniqueOTP(int[] otp){

        for(int i=0;i<otp.length;i++){
            for(int j=i + 1;j<otp.length;j++){
                if(otp[i] == otp[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int[] otp = new int[10];
        obj.generateOTP(otp);
        System.out.println(obj.isuniqueOTP(otp));
    }
}