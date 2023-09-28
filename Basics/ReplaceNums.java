
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
