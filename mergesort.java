import java.util.Arrays;

public class mergesort {

    public static void conquer(int[] arr, int start, int mid, int end) {
        int[] merge = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid + 1; 
        int x = 0;

        
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }
        while (idx2 <= end) {
            merge[x++] = arr[idx2++];
        }
        for (int i = 0, j = start; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }
    public static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); 
    }
}