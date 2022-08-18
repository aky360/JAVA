// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*a = temp;
temp = b;
a = b;
*/

 // Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null){
            return head;
        }
        
        ListNode curr = head;
        curr.next = null;
        head = head.next;
        prev = head;
        
        while(head != null){
            head = prev.next;
            prev.next = curr;
            curr = prev;
            prev = head;
        }
        return curr;
    }
    
    public static void printLL(ListNode head){
        if(head == null){
            return ;
        }
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    public static void main(String args[]){
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        
        Solution sol = new Solution();
        
        
    }
    
}


