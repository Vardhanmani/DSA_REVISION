public class recursionaarray {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 4, 3, 5};

        System.out.print("Is arr1 sorted? " + isSorted(arr1, 0));
        System.out.print("Is arr2 sorted? " + isSorted(arr2, 0));
    }
}
