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
class Testing implements Runnable {
    @Override
    public void run(){
        System.out.println("Do Something ");
    }
}

class ThreadExample extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Testing());
        t1.start();
        System.out.println("Thread has been created with name " + t1.getName()); 
    }
}


/*
Thread (Runnable r, String r)
We may use this constructor to generate a new Thread object by passing a Runnable reference
as the first parameter and also providing a name for the newly generated thread.
*/
class Book implements Runnable {
    @Override
    public void run(){
        System.out.println("Do Something task ");
    }
}

class ThreadExample extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Book(), "book thread");
        t1.start();
        System.out.println("Thread has been created with name " + t1.getName()); 
    }
}
