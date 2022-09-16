class Solution {
    
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.mySqrt(100));
        System.out.println(obj.mySqrt(1024));
        System.out.println(obj.mySqrt(4096));
    }
    
    
    // USING BINARY SEARCH APPROACH 
    public int mySqrt(int x) {
        int left=1,right =x, result=0;
        while(left<right){
            int mid = left + (right - left)/2;
            if(mid<x/mid){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return (left==x/left)?left:left-1;
    }
    
    
    // ANOTHER WAY IS ===>> USING BINARY SEARCH APPROACH 
    public int mySqrt(int x) {
        long l = 1, h = x;
        while(l <= h){
            long mid = (l+h)/2;
            if(mid * mid == x){
                return (int)mid;
            }
            else if(mid * mid < x){
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }
        return (int)h;
    }
    
}
