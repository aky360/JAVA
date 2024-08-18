import java.util.*;
class Solution {
    
    static boolean areBracketsBalanced(String expr){
        Deque<Character> stack = new ArrayDeque<Character>();
        
        for(int i=0;i<expr.length();i++){
            char ch = expr.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                continue;
            }
            
            if(stack.isEmpty()){
                return false;
            }
            char x;
            
            switch(ch){
                case ')':
                    x = stack.pop();
                    if(x=='{' || x == '[') return false;
                    break;
                case '}':
                    x = stack.pop();
                    if(x=='(' || x == '[') return false;
                    break;
                case ']':
                    x = stack.pop();
                    if(x=='{' || x == '(') return false;
                    break;
            }
        }
        return (stack.isEmpty());
    } 
    
    
    public static void main(String[] args) {
        String expr = "([{}])";

        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
