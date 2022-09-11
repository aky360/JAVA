class Solution {
    public String addBinary(String a, String b) {
        return sum(a, b);
    }
    public static String sum(String b1, String b2) { 
        int len1 = b1.length(); 
        int len2 = b2.length(); 
        int carry = 0; 
        String res = ""; 
        
        int maxLen = Math.max(len1, len2); 
        for (int i = 0; i < maxLen; i++) { 
            int p = i < len1 ? b1.charAt(len1 - 1 - i) - '0' : 0; 
            int q = i < len2 ? b2.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry; 
            carry = tmp / 2; 
            res = tmp % 2 + res; 
            
        } 
        return (carry == 0) ? res : "1" + res; 
    }
}
