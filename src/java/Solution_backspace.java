package java;

import java.util.Stack;

public class Solution_backspace {
    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }

    private String getString(String str) {
        Stack<Character> stack = new Stack<>();
        for(Character aChar: str.toCharArray()) {
            if(aChar != '#') {
                stack.push(aChar);
            }else if(!stack.empty()) {
                stack.pop();
            }
        }
        return stack.toString();
    }
}
