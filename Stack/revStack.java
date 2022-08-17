import java.util.Stack;

class Solution{
    
    public static void stackRev(Stack<Integer> st){
        Stack<Integer> temp = st;
        if(temp.isEmpty()){
            return ;
        }   
        int x = st.peek();
        st.pop();
        stackRev(st);
        System.out.println(x);
    }
    
    public static int stackSize(Stack<Integer> st){
        Stack<Integer> temp = st;
        if(temp.isEmpty()){
            return 0;
        }
        int count = 0;
        while(!temp.isEmpty()){
            // int x = st.peek();
            count++;
            temp.pop();
        }
        return count;
    }
    
    public static void printStack(Stack<Integer> st){
        Stack<Integer> temp = st;
        if(temp.isEmpty()){
            System.out.println("stack empty ");
            return ;
        }
        while(!temp.isEmpty()){
            int x = st.peek();
            System.out.println(x);
            temp.pop();
        }
    }
    //Stack<int> st = new Stack<>();
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(new Integer(10));
        st.push(new Integer(101));
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        //Stack<Integer> sst = new Stack<Integer>(st);
        
        
        //System.out.println(st.size());
        //System.out.println(Solution.stackRev(st));
        //stackRev(st);
        printStack(st);
        //System.out.println(Solution.stackSize(st));
    }
}
