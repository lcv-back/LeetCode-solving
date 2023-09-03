import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                myStack.push(c);
            } else { // c == ')' || c == ']' || c == '}'
                if (myStack.empty()) {
                    // avoid case: stack empty but also find peek
                    return false;
                }
                char temp = myStack.peek();
                if ((c == ')' && temp == '(')
                        || (c == ']' && temp == '[')
                        || (c == '}' && temp == '{')) {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "()"; // Outcome: true
        String s1 = "()[]{}"; // Outcome: true
        String s2 = "(]"; // Outcome: false

        boolean result = isValid(s);
        System.out.println("Result = " + result);
    }
}