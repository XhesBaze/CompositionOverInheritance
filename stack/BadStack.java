package stack;

import java.util.Stack; // Stack extends Vector

public class BadStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.insertElementAt("squeeze me in!", 1); // not stack behaviour
        
        
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
