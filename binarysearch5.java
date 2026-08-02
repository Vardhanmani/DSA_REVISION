public class binarysearch5 {

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } 
            else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6, 3, 6};
        int peak1 = findPeakElement(arr1);
        System.out.println("Peak index for arr1: " + peak1); 
        int[] arr2 = {0, 5, 10, 8, 3};
        int peak2 = findPeakElement(arr2);
        System.out.println("Peak index for arr2: " + peak2); 
        int[] arr3 = {0, 5, 1, 2, 3};
        int peak3 = findPeakElement(arr3);
        System.out.println("Peak index for arr2: " + peak3);
    }
}

