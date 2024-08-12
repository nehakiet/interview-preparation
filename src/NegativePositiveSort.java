import java.util.Arrays;

public class NegativePositiveSort {
    public static void main(String[] args) {
        int[] arr = {-11, -8, 5, 4, -9, -10, 19};
      //  System.out.println(Arrays.toString(rearrange(arr)));
        rearrange(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static int[] rearrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] < 0 && left < right) {
                left++;
            }

            while (arr[right] >= 0 && left < right) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
}
