package bs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 34, 40, 56};
        int target = 40;
        System.out.println(findIndex(arr, target));
    }

    private static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else
                start = mid + 1;

        }
        return -1;
    }

}
