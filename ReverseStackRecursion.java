import java.util.Stack;

public class ReverseStackRecursion {

    public static void insertAtBottom(Stack<Integer> st, int x) {
        // Base case: 
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st) {
        // Base case:
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        reverseStack(st);

        while(!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}