/*
844. Backspace String Compare
*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return stringCompare(s).equals(stringCompare(t));
    }
    public String stringCompare(String s){
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != '#'){
                str.append(c);
            }else if(str.length() != 0){
                str.deleteCharAt(str.length()-1);           // O(1)
            }
        }
        return str.toString();
    }
}
// T.C. : O(n)
// S.C. : O(n)
