class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int[] revArr = arrRev(arr);
        printArray(revArr);
    }
    
    public static int[] arrRev(int[] arr){
        int n = arr.length-1;
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    
    static void printArray(int arr[]){
        int size = arr.length;
        for (int i = 0; i < size; i++)
             System.out.print(arr[i] + " ");
          
         System.out.println();
    }
}
