import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int nums[] = {2, 7, 11, 15};
        int target = 11;
        int arr[] = new int[2];

        System.out.println(Arrays.toString(findTwoSum(nums, target, arr)));


    }

    private static int[] findTwoSum(int[] nums, int target, int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = hashMap.get(target - nums[i]);
            if (value == null) {
                hashMap.put(nums[i], i);
            } else {
                arr[0] = i;
                arr[1] = value;
            }

        }
        return arr;
    }


}
