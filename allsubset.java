import java.util.*;

public class allsubset {
    public static void subset(int[] arr, int index, List<Integer> current) {
        // BASE CASE: We reached the end of the input array
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        current.add(arr[index]);              
        subset(arr, index + 1, current);      
        current.remove(current.size() - 1);   

        subset(arr, index + 1, current);       
    }

    public static void main(String args[]) {
        int arr[] = {1, 2};
        subset(arr, 0, new ArrayList<>());
    }
}