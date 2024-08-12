package bs;

public class BsReverseArray {
    public static void main(String[] args) {
        int[] arr = {20, 17, 16, 14, 13, 12, 11, 10, 2};
        int target = 20;
        System.out.println(findIndex(arr, target));
    }

    private static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return -1;

    }

}
