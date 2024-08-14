/* Java Program to implement a stack using
two queue */
import java.util.*;

class Solution {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        // To maintain current number of elements
        static int curr_size;

        static void push(int x){
            // Push x first in empty q2
            q2.add(x);
            // Push all the remaining elements in q1 to q2.
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            // swap the names of two queues
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static void pop(){
            // if no elements are there in q1
            if (q1.isEmpty())
                return;
            q1.remove();
        }

        static int top(){
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        static int size() { return q1.size(); }
    }

    // driver code
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}

=============================================================================================================================

/* Java Program to implement a stack
using two queue */
import java.util.*;

class Stack {
    Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();

    void remove(){
        if (q1.isEmpty())
            return;
        // Leave one element in q1 and
        // push others in q2.
        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }
        // Pop the only left element from q1
        q1.remove();
        
        // swap the names of two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    void add(int x) { q1.add(x); }

    int top(){
        if (q1.isEmpty())
            return -1;

        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }

        // last pushed element
        int temp = q1.peek();

        // to empty the auxiliary queue after
        // last operation
        q1.remove();

        // push last element to q2
        q2.add(temp);

        // swap the two queues names
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return temp;
    }

    int size() { return q1.size(); }

    // Driver code
    public static void main(String[] args){
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.remove();
        System.out.println(s.top());
        s.remove();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());
    }
}

==========================================================================================================================

import java.util.*;

/* Java Program to implement a stack
using only one queue */

class Stack {
    // One queue
    Queue<Integer> q1 = new LinkedList<Integer>();

    void push(int x){
        //  Get previous size of queue
        int s = q1.size();

        // Push the current element
        q1.add(x);

        // Pop all the previous elements and put them after
        // current element
        for (int i = 0; i < s; i++) {
            q1.add(q1.remove());
        }
    }

    void pop(){
        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
    }

    int top(){
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    int size() { return q1.size(); }

    // driver code
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}
