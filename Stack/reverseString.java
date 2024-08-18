import java.util.*;
class Solution {
    
    public static void reverse(StringBuffer str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        str.delete(0, str.length());
        while(!s.isEmpty()){
            str.append(s.pop());
        }
        
    }
    
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("GeeksQuiz");
        reverse(str);
        System.out.println("Reversed string is : " + str);
    }
}
