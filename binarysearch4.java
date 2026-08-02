public class binarysearch4 {
    public static boolean search (int arr[] , int target,int start,int end){
        if (start > end) {
            return false;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return true;
        }

        if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
            return search(arr, target, start + 1, end - 1);
        }
        if (arr[start] <= arr[mid]) {
        if (target >= arr[start] && target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        } else {
            return search(arr, target, mid + 1, end);
        }
    } 

    else {
        if (target > arr[mid] && target <= arr[end]) {
            return search(arr, target, mid + 1, end);
        } else {
            return search(arr, target, start, mid - 1);
        }
    }
    }
    public static void main (String aargs[]){
        int arr[] = {1,2,4,5,6,6,4,1,1,1};
        boolean result = search(arr,1,0,arr.length-1);
        System.out.print(result);
    }
}
