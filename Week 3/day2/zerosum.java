import java.util.*;


public class ZeroSumSubarrays {
   public static List<int[]> findSubarraysWithZeroSum(int[] arr) {
       Map<Integer, List<Integer>> map = new HashMap<>();
       List<int[]> result = new ArrayList<>();


       int sum = 0;
       map.put(0, new ArrayList<>());
       map.get(0).add(-1);


       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];


           if (map.containsKey(sum)) {
               for (int startIdx : map.get(sum)) {
                   result.add(new int[]{startIdx + 1, i});
               }
           }


           map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
       }


       return result;
   }


   public static void main(String[] args) {
       int[] arr = {3, 4, -7, 1, 3, -4, -2, -2};


       List<int[]> subarrays = findSubarraysWithZeroSum(arr);
       for (int[] pair : subarrays) {
           System.out.println("Subarray found from index " + pair[0] + " to " + pair[1]);
       }
   }
}
