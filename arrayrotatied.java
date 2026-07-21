import java.util.*;

public class arrayrotatied {
    public static boolean Acircle(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }
        if (arr[arr.length - 1] > arr[0]) {
            count++;
        }
        if (count <= 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String args[]) {
        int arr1[] = {3, 5, 7, 1, 6, 2};
        System.out.println("Result 1: " + Acircle(arr1)); 
        int arr2[] = {3, 4, 5, 1, 2};
        System.out.println("Result 2: " + Acircle(arr2)); 
    }
}