package chap15.stack_ex;

import java.util.Arrays;
import java.util.Stack;

// 프로그래머스 Stack 문제

public class StackExample {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if(stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        System.out.println("출력 결과 : " + Arrays.toString(answer));
    }
}
