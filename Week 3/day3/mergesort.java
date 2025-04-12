public class MergeSortBookPrices {
   public static void merge(int[] arr, int left, int mid, int right) {
       int n1 = mid - left + 1;
       int n2 = right - mid;


       int[] leftArr = new int[n1];
       int[] rightArr = new int[n2];
       System.arraycopy(arr, left, leftArr, 0, n1);
       System.arraycopy(arr, mid + 1, rightArr, 0, n2);
       int i = 0, j = 0;
       int k = left;
       while (i < n1 && j < n2) {
           if (leftArr[i] <= rightArr[j]) {
               arr[k] = leftArr[i];
               i++;
           } else {
               arr[k] = rightArr[j];
               j++;
           }
           k++;
       }


       while (i < n1) {
           arr[k] = leftArr[i];
           i++;
           k++;
       }


       while (j < n2) {
           arr[k] = rightArr[j];
           j++;
           k++;
       }
   }


   public static void mergeSort(int[] arr, int left, int right) {
       if (left < right) {
           int mid = left + (right - left) / 2;


           mergeSort(arr, left, mid);
           mergeSort(arr, mid + 1, right);


           merge(arr, left, mid, right);
       }
   }
   public static void printArray(int[] arr) {
       for (int price : arr) {
           System.out.print(price + " ");
       }
       System.out.println();
   }


   public static void main(String[] args) {
       int[] bookPrices = {350, 200, 550, 100, 300, 400};


       System.out.println("Original Book Prices:");
       printArray(bookPrices);


       mergeSort(bookPrices, 0, bookPrices.length - 1);


       System.out.println("Sorted Book Prices (Ascending Order):");
       printArray(bookPrices);
   }
}
