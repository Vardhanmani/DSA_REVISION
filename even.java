import java.util.*;

public class even {
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 2, 9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}