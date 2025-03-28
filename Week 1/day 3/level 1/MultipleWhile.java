import java.util.Scanner;
public class MultipleWhile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		int counter = num - 1;
		while(counter>1){
			if(num%counter==0){
				System.out.println(counter);
				counter--;
			}
		}
	}
}