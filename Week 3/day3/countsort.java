public class CountingSortStudentAges {
   public static void countingSort(int[] ages) {
       int maxAge = 18;
       int minAge = 10;
       int[] count = new int[maxAge - minAge + 1];
       for (int age : ages) {
           count[age - minAge]++;
       }
       for (int i = 1; i < count.length; i++) {
           count[i] += count[i - 1];
       }
       int[] sortedAges = new int[ages.length];
       for (int i = ages.length - 1; i >= 0; i--) {
           int age = ages[i];
           sortedAges[count[age - minAge] - 1] = age;
           count[age - minAge]--;
       }


       System.arraycopy(sortedAges, 0, ages, 0, ages.length);
   }


   public static void printArray(int[] arr) {
       for (int age : arr) {
           System.out.print(age + " ");
       }
       System.out.println();
   }


   public static void main(String[] args) {
       int[] studentAges = {15, 12, 17, 14, 10, 16, 13, 18, 11};


       System.out.println("Original Student Ages:");
       printArray(studentAges);


       countingSort(studentAges);


       System.out.println("Sorted Student Ages (Ascending Order):");
       printArray(studentAges);
   }
}
