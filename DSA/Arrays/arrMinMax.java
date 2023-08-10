import java.util.Arrays;

class Pair {  
    long first, second;  
    public Pair(long first, long second){  
        this.first = first;  
        this.second = second;  
    }  
}

class Compute {
    static Pair getMinMax(long a[], long n){
        //Write your code here
        //stream(T[] array)  ==>  The stream(T[] array) method of the Arrays class in Java returns a sequential stream of the array passed as the argument.
        // Arrays.stream(array) ==> This method simply takes an array and returns the sequential stream of all the elements of the array.
        return new Pair(Arrays.stream(a).min().getAsLong(), Arrays.stream(a).max().getAsLong());
    }
}
