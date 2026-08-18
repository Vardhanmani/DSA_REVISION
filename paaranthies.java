
    import java.util.Stack;

public class paaranthies {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // If it's a closing bracket, check if stack is empty first
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                // Check if the closing bracket matches the top opening bracket
                if ((ch == ')' && top == '(') || 
                    (ch == '}' && top == '{') || 
                    (ch == ']' && top == '[')) {
                    st.pop(); // Matching pair found, remove it
                } else {
                    return false; // Mismatched brackets
                }
            }
        }

        // If the stack is empty, all brackets were matched successfully
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); 
        System.out.println(isValid("(]"));     
        System.out.println(isValid("([)]"));   
        System.out.println(isValid("{[]}"));   
    }
}

