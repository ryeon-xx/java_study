package chap15.stack_ex;

import java.util.Stack;

public class BJStackExample {
    public static void main(String[] args) {
         String s = "()()";  // true
        // String s = ")()(";  // false

        Stack<Character> stack = new Stack<>();
        boolean answer = false;

        try {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack.push('(');
                } else {
                    stack.pop();
                }
            }
            answer = stack.empty();
        } catch (Exception e) {
            answer = false;
        }
        System.out.println(answer);
    }
}
