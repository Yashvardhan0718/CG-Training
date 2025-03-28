import java.util.*;

public class NumberChecker {

    public static int countDigits(int num) {
        int count = 0, temp = num;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        int temp = num;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num) {
        int[] digits = storeDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int num) {
        int[] digits = storeDigits(num);
        int[] frequency = new int[10];

        for (int digit : digits) {
            frequency[digit]++;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) count++;
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Count of digits: " + countDigits(num));

        int[] digits = storeDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        System.out.println("Is Harshad Number: " + isHarshadNumber(num));

        int[][] freq = digitFrequency(num);
        System.out.println("Digit Frequency:");
        for (int[] row : freq) {
            System.out.println("Digit: " + row[0] + " -> Frequency: " + row[1]);
        }
    }
}

