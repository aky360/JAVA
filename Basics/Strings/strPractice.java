
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("this"+(char)65);
        //String str = "strings";
        String myString = "foobar";
        if (myString.contains("o")) {
            System.out.println("yes contais !");
        }
        StringBuffer t=new StringBuffer();
        
        for(int i=0;i<5;i++){
            t.append((char)(65+i));
        }
        t.reverse();
        char[] s=t.toString().toCharArray();
        System.out.println("Hello, !"+Arrays.toString(s));
        System.out.println("string, !"+String.valueOf(s));
        System.out.println("string, !"+new String(s));
        System.out.println("Hello, World!"+t);
        
        System.out.println("Hello, World!"+t);
        System.out.println('Z'+'A'-'B');
        if('B'>='A'){
            System.out.println("Hello, World asda !");
        }
        System.out.println('Z'-'A');
    }
}
