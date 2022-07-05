import java.lang.Thread;

/*
Thread()
The default Thread() constructor is used to create a new Thread class.
*/
public class ThreadExample extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        System.out.println("Thread has been created with name " + t1.getName()); 
    }
}


/*
Thread (String str)
A thread object is created and a name is provided to the same.
*/
public class ThreadExample extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread("Your Name");
        t1.start();
        System.out.println("Thread has been created with name " + t1.getName()); 
    }
}


/*
Thread (Runnable r)
In this constructor type, Runnable reference is passed and a new Thread object is created.
*/
