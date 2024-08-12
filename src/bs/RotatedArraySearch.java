package bs;//To find the index of element in the sorted rotated array in log(n) only.
//Arr=[4,5,6,0,1,2], target element=0
//Returns the index of 0 i.e 3


public class RotatedArraySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 1, 2};
        int target = 0;
        int index = search(arr, target);
        System.out.println("Index of " + target + ": " + index);
    }
}

//=======================================================================
//    public static void main(String[] args) {
//        int[] arr={4,5,6,0,1,2};
//        int target=0;
//        System.out.println(findEle(arr,target));
//    }
//    private static int findEle(int[] arr,int target) {
//        int start=0;
//        int n=arr.length;
//        int end= n-1;
//        while(start<=end){
//            int mid= start+(end-start)/2;
//            int prev = mid+n-1%n;
//            int next= (mid+1)%n;
//
//            if(arr[mid]<prev && arr[mid]<next){
//                return mid;
//            }
//
//            }
//        return 0;
//    }
//}
