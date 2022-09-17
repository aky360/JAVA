// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.*;
class HelloWorld {
    public static void main(String[] args) {
        int[][] mat = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        HelloWorld obj = new HelloWorld();
        int[][] matrixData = obj.makeMaxMatrix(mat);
        for(int i=0;i<matrixData.length;i++){
            for(int j=0;j<matrixData[0].length;j++){
                System.out.println(matrixData[i][j]);
            }
        }
    }
    
    public int[][] makeMaxMatrix(int[][] grid){
        int[][] newMatrix = new int[grid.length-2][grid[0].length-2];
        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[0].length;j++){
                newMatrix[i][j] = getMaxVal(grid, i, j);
            }
        }
        return newMatrix;
    }
    
    public int getMaxVal(int[][] grid, int l, int r){
        int max = 0;
        for(int i = 0;i<l+3;i++){
            for(int j=0;j<r+3;j++){
                max = Math.max(grid[i][j], max);
            }
        }
        return max;
    }
}


//===================================================================================================================



class HelloWorld {
    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        System.out.println("Hello, World!"+obj.mySqrt(100));
    }
    
    public int mySqrt(int x) {
        int left=1,right =x, result=0;
        System.out.println("left " +left+ "right "+right+ "result "+result);
        
        while(left<right){
            System.out.println("left "+left+" right "+right);
            int mid = left + (right - left)/2;
            System.out.println("mid "+mid);
            if(mid<x/mid){
                left = mid+1;
                System.out.println("left "+left);
            }else{
                right = mid;
                System.out.println("right "+right);
            }
        }
        return (left==x/left)?left:left-1;
    }
}
==========================================================================================================================================
    
    
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        result = result.next;
        
        int list1Size = Solution.listSize(list1);
        int list2Size = Solution.listSize(list2);
        
        if(list1Size == 0)
            return list2;

        if(list2Size == 0)
            return list1;
    
        
        //if(list1Size > list2Size){
            while(list1 != null && list2 != null){
                if(list1.val >= list2.val){
                    result.val = list2.val;
                    result = result.next;
                    list2 = list2.next;
                }
                else{
                    result.val = list1.val;
                    result = result.next;
                    list1 = list1.next;
                }
            }
        if(list1 != null){
            while(list1 != null){
                result.val = list1.val;
                result = result.next;
                list1 = list1.next;
            }
        }
        if(list2 != null){
            while(list2 != null){
                result.val = list2.val;
                result = result.next;
                list2 = list2.next;
            }
        }
        
        //}
        return head.next;
    }
    
    
    public static int listSize(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
