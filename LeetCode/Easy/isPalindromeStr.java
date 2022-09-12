class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        if (s==null || s.length() ==0) return false;
        /*for(int i=0;i<s.length();i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                str = str + Character.toLowerCase(s.charAt(i));
            }
        }*/
        s = s.replaceAll("[^a-zA-Z0-9]", "");  // removes all non-alphanumeric characters (like : , _ etc)
        s = s.toLowerCase();
        return checkPalindrome(s);
    }
    
    public static boolean checkPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
