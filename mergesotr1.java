public class mergesotr1 {
    public static int conquer(int[] arr, int st, int mid, int end) {
        int[] temp = new int[end - st + 1];
        int idx1 = st;
        int idx2 = mid + 1;
        int x = 0;
        int count = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                temp[x++] = arr[idx1++];
            } else {
                temp[x++] = arr[idx2++];
                count += (mid - idx1 + 1);
            }
        }
        while (idx1 <= mid) {
            temp[x++] = arr[idx1++];
        }
        while (idx2 <= end) {
            temp[x++] = arr[idx2++];
        }
        for (int i = 0, j = st; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }

        return count;
    }

    public static int divide(int[] arr, int st, int end) {
        int count = 0;

        if (st < end) {
            int mid = st + (end - st) / 2;
            count += divide(arr, st, mid);      
            count += divide(arr, mid + 1, end);
            count += conquer(arr, st, mid, end);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3};
        int totalInversions = divide(arr, 0, arr.length - 1);
        
        System.out.println("Total Inversions: " + totalInversions); 
    }
}