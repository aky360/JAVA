class Solution {
    
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.mySqrt(100));
        System.out.println(obj.mySqrt(1024));
        System.out.println(obj.mySqrt(4096));
        System.out.println(obj.mySqrt(81));
        System.out.println(obj.mySqrt(512));
    }
    
    // VERIFIED SOLUTION IN LEETCODE
    public int mySqrt(int x) {
        int i;
        if(x==0) return 0;
        if(x<4) return 1;
        for(i=1;i<=x/2;i++)
            if((i*i<=x)&&((i+1)*(i+1)>x)) return i;
        return 0;
    }
    
    
    // ANOTHER WAY TO FIND THE SQUAREROOT OF INTEGER VALUE IS GIVEN
    public int mySqrt(int x) {

        if(x==0) return 0;
        
        int i=1;
        while(i*i <= x) ++i;
        
        return i-1;
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
    
}
