import java.util.*;
import java.util.Stack;
public class Stackgreaterelement {
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] result = nextGreater(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Next Greater:   " + Arrays.toString(result));
    }
}

