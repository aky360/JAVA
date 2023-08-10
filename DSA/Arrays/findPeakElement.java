class Solution{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
  public static int findMax(int a, int b){
    int max = (a>b) ? a : b;
    return max;
  }
	
  public int peakElement(int[] arr,int n){
    //add code here.
    if(n == 1) return 0;                             // if arr has only one element
    if(arr[0] >= arr[1]) return 0;                   // for first greater element
    if(arr[n-1] >= arr[n-2]) return n-1;             // for last greater element
        
    for(int i=1;i<n-1;i++){
      if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) return i;
    }
    return 0;
  }
}
