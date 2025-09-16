package Unit_3.Collection;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();

        stk.push("first");
        stk.push("Seconf");

        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.size());
        stk.clear();
        System.out.println(stk.isEmpty());

    }
}