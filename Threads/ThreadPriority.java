import java.lang.Thread;


public class ThreadPriority extends Thread{
    public void run(){
        System.out.println("the thread is running " + Thread.currentThread().getPriority());
    }
    
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        //t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        //t3.start();
    }
}


/*
The main thread's priority is set to 5 by default, and each child thread will have the same priority as its parent thread. 
We have the ability to adjust the priority of any thread, whether it is the main thread or a user-defined thread. 
It is advised to adjust the priority using the Thread class's constants, which are as follows:
*/

/*
Thread.MIN_PRIORITY = 1;
Thread.NORM_PRIORITY = 5;
Thread.MAX_PRIORITY = 10;

1 is known as the lowest priority.
5 is known as standard priority.
10 represents the highest level of priority.
*/
