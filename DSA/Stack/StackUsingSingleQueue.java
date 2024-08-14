
import java.util.*;

class Solution{
    
    static class stack{
        static Queue<Integer> q = new LinkedList<Integer>();
    
        static void push(int x){
           int size = q.size();
           q.add(x);
           for(int i=0;i<size;i++){
               q.add(q.remove());
           }
        }
        static int pop(){
            if(q.isEmpty()){
                return -1;
            }
            return q.remove();
        }
        
        static int top(){
            if(q.isEmpty()){
                return -1;
            }
            return q.peek();
        }
        static boolean isEmpty(){
            if(q.size()==0) return true;
            else return false;
        }
        
    }
    
    
    public static void main(String[] args) {
        stack s = new stack();
        System.out.println("queue element :" + s.q);
        s.push(10);
        System.out.println("queue element :" + s.q);
        s.push(20);
        System.out.println("Top element :" + s.top());
        System.out.println("queue element :" + s.q);
        s.pop();
        s.push(30);
        s.pop();
        System.out.println("Top element :" + s.top());
    }
    
}
