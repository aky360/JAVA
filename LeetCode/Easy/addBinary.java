class Solution {
    
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        //System.out.println(add(a, b));
        System.out.println(sum(a, b));
        System.out.println('a' - '0');
        System.out.println('1' - '0');
        System.out.println('0' - '0');
    }
    
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


//another way to add binary number in string in java
class Solution{
    
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(add(a, b));
        System.out.println('a' - '0');
        System.out.println('1' - '0');
        System.out.println('0' - '0');
    }
    
    public String addBinary(String a, String b) {
        return add(a, b);
    }
    
    public static String add(String first, String second) { 
        int b1 = Integer.parseInt(first, 2); 
        int b2 = Integer.parseInt(second, 2); 
        int sum = b1 + b2; 
        return Integer.toBinaryString(sum); 
    }
}




class Solution {
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int endIdxA = a.length() - 1;
    int endIdxB = b.length() - 1;
    int carry = 0;
    while (endIdxA >= 0 || endIdxB >= 0 || carry > 0) {
      int value = carry;
      if (endIdxA >= 0) {
        value += Character.getNumericValue(a.charAt(endIdxA--));
      }
      if (endIdxB >= 0) {
        value += Character.getNumericValue(b.charAt(endIdxB--));
      }
      sb.append(value % 2);
      carry = value / 2;
    }
    return sb.reverse().toString();
  }
}
