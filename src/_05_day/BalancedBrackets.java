package _05_day;

import java.util.Stack;

public class BalancedBrackets {

    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> st = new Stack<>();
        boolean valid = true;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
                continue;
            }
            if(st.isEmpty()){
                return "NO";
            }
            if(ch == ')'){
                if(st.peek() == '('){
                    st.pop();
                }else{
                    valid = false;
                    break;
                }
            }
            if(ch == ']'){
                if(st.peek() == '['){
                    st.pop();
                }else{
                    valid = false;
                    break;
                }
            }
            if(ch == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }else{
                    valid = false;
                    break;
                }
            }
        }
        if(!st.isEmpty()){
            valid = false;
        }
        if(valid)
            return "YES";
        else
            return "NO";


    }
}
