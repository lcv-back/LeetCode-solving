import java.util.Stack;

public class _32_Longest_Valid_Parentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> myStack = new Stack<>();
        int max = 0;
        myStack.push(-1); // to inititive new stack
        // to check is empty
        // and if only element is -1 can calculator "max value"
        //

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                myStack.push(i);
            } else { // ')'
                myStack.pop();
                if (myStack.empty()) { // pop -1
                    myStack.push(i); // push i to initiative new stack
                } else { // dont empty
                    // if pop dont empty when it is a pair of '(' and ')'
                    max = Math.max(max, i - myStack.peek());
                    // i is current index
                    // peek value is value dont be "pop"
                    // to check continuity of substring
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "()(()";
        int result = longestValidParentheses(s);
        System.out.println("Result = " + result);
    }
}
