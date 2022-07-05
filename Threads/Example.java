/*
A deadlock is a situation in which two or more threads are stuck waiting for each other indefinitely. When several threads need the same locks but 
receive them in separate orders, a deadlock occurs. In a Java multithreaded program, a deadlock condition may occur because the synchronized keyword causes 
the executing thread to block while waiting for the lock, associated with the specified object.

To prevent deadlock, make sure that when you obtain several locks, you always acquire them in the same order across all threads. 
Here is an example of code which may result in a deadlock.
*/

import java.lang.Thread;

public class Example{
    private final String name;
    public Example(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public synchronized void call(Example caller){
        System.out.println(this.getName() + " he asked to call me " + caller.getName());
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        caller.callMe(this);
    }
    public synchronized void callMe(Example caller){
        System.out.println(this.getName() + " he called me " + caller.getName());
    }
    
    public static void main(String[] args) {
        Example caller1 = new Example("caller-1");
        Example caller2 = new Example("caller-2");
        //System.out.println("Hello, World!"); 
        new Thread(new Runnable(){
            public void run(){
                caller1.call(caller2);
            }
            
        }).start();
        
        new Thread(new Runnable(){
            public void run(){
                caller2.call(caller1);
            }
            
        }).start();
    }
}


/*
This code will probably result in a deadlock for the two generated threads. The lock on object caller1 and caller2 are already owned by 
respective threads forcing the threads to wait for each other to unlock such locks. This would trigger a deadlock and prevent the callMe() function from being called.
*/
