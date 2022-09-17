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
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode;
        while(true){
            if(list1 == null){
                temp.next = list2;
                break;
            }
            if(list2 == null){
                temp.next = list1;
                break;
            }
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        return dummyNode.next;
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// SOLUTION USING RECURSION TECHNIQUE

class Solution {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return SolutionRec(list1, list2);
    }
    
    public ListNode SolutionRec(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        if(list1.val < list2.val){
            list1.next = SolutionRec(list1.next,list2);
            return list1;
        }
        else{
            list2.next = SolutionRec(list1, list2.next);
            return list2;
        }
    }
}
