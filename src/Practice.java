package common.companies.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
       int[] nums = {4, 6, 7, 8, 9, 10, 12};
        int target = 11;
        findTarget(nums, target);
        fibSeries();
        int[] arr = {4, 2, 7, 45, 99};
        System.out.println(findMaxNum(arr));
        System.out.println(find2ndMax(arr));

        String str  = "abcdbcdamn";
        String[] str1 = str.split("");
       HashMap<String,Long> hm = Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
       for(Map.Entry<String,Long>map : hm.entrySet()) {
           if (map.getValue() == 1) {
               System.out.println("first non repeating char is " + map.getKey());
               break;
           }
       }
    }
    private static int findMaxNum(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        for (int i : nums) {
           if(i>maxNum){
              maxNum = i;
           }
        }
        return maxNum;
    }
    private static int find2ndMax(int[]nums){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secondMax = max;
                max = nums[i];
            } else if (nums[i]<max && nums[i]>secondMax) {
                secondMax = nums[i];
            }
        }
        return secondMax;
    }

    private static void fibSeries() {
        int n = 10;
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
            System.out.println(fib[i]);
        }
    }
      private static void findTarget(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int result = Integer.MIN_VALUE;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (target==nums[mid]) {
                System.out.println("target's index is " + mid);
                return;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                result=nums[mid];
                start = mid + 1;
            }
        }
        if(result!=Integer.MIN_VALUE){
            System.out.println("largest value lesser than target is " + result);
        }else {
            System.out.println("no value is there ");
        }
    }
}

    
   
