package bs;

public class CustomBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 1, 2};
        int target = 2;
        System.out.println(findEle(arr, target));
    }

    private static int findEle(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }

        }
        return -1;
    }
}
