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
