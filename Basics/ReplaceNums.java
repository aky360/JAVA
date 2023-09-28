/*
int n = 34325;
StringBuffer str = new StringBuffer();
StringBuffer str = new StringBuffer(Integer.toString(n));
String.valueOf(n);
Integer.toString(n);
str.toString();
Integer.parseInt(str.toString());
*/

class ReplaceNums {
    public static void main(String[] args) {
        System.out.println("replace 0's "+ convertFive(1004));
    }
    
    public static int convertFive(int n){
	    StringBuffer str = new StringBuffer(Integer.toString(n));
        String numString = String.valueOf(n);
        int x = 34;
        System.out.println(" is of type class object  " + ((Object)str)); 
        System.out.println(" is of type class " + ((Object)str).getClass()); 
        System.out.println(" is of type name " + ((Object)x).getClass().getSimpleName());  
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                str.setCharAt(i, '5');
            }
        }
        if(str.toString() != Integer.toString(n)){
            return Integer.parseInt(str.toString());
        }
        return n;
    }
}




public static int convertFive(int n){
	    StringBuffer str = new StringBuffer(Integer.toString(n));
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                str.setCharAt(i, '5');
            }
        }
        if(str.toString() != Integer.toString(n)){
            return Integer.parseInt(str.toString());
        }
        return n;
    }




public static int convertFive(int n){
	    StringBuffer str = new StringBuffer();
        String num = String.valueOf(n);
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            if(ch == '0'){
                ch = '5';
            }
            str.append(ch);
        }
        return Integer.parseInt(str.toString());
}




public static int convertFive(int n){
	    int rev=0, num=0;
	    while(n!=0){
	        int digit = n%10;
	        if(digit==0){
	            digit = 5;
	        }
	        rev = rev*10+digit;
	        n = n/10;
	    }
	    while(rev!=0){
	        int digit = rev%10;
	        num = num*10+digit;
	        rev = rev/10;
	    }
	    return num;
    }



public static int convertFive(int n){
	    String str = Integer.toString(n);
	    String newStr = str.replace('0', '5');
	    return Integer.parseInt(newStr);
    }



