import java.util.*;

public class Main {

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

    public static boolean isDuckNumber(int num) {
        int temp = num;
        while (temp > 0) {
            if (temp % 10 == 0) return true;
            temp /= 10;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int num) {
        int temp = num, sum = 0, count = countDigits(num);

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : digits) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int num : digits) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Count of digits: " + countDigits(num));

        int[] digits = storeDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Is Duck Number: " + isDuckNumber(num));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(num));

        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestValues[0] + ", Second Largest: " + largestValues[1]);

        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestValues[0] + ", Second Smallest: " + smallestValues[1]);
    }
}