import java.util.*;
import java.util.Stack;

public class StackreversString {
    public static String string(String str) {
        Stack<Character> st = new Stack<>();

        // Push all characters
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i)); 
        }

        // Pop all characters to reverse
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }

    public static void main(String args[]) {
        String str = "mani";
        String revers = string(str);
        System.out.print(revers);
    }
}