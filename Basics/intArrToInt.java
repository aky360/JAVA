import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("array to single integer number ");
        int[] arr = {1,2,3};
        StringBuilder builder=new StringBuilder(); 
        for(int i=0;i<arr.length;i++){
            builder.append(arr[i]);
        }
        
        int number = Integer.parseInt(builder.toString());           // 123
        
        System.out.println("builder "+builder);                       // '123'
        System.out.println("number "+number);                        // 123
        
        int num = 1234567;
        int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();        // single integer number to array  ==>>  {1,2,3}
        System.out.println("digitsn convert array "+digits.length);
        for(int d : digits)
            System.out.println(d);
    }
}
