import java.io.*;
import java.util.*;
import java.lang.*;

class CreateThread extends Thread{
    boolean stop = false;
    public void run(){
        
        for(int i=1;i<100000;i++){
            System.out.println(i);
            if(stop){
                return;
            }
        }
    }
}


class entrKeyToStopThreadDemo{
    public static void main(String[] args) throws IOException {
        CreateThread obj = new CreateThread();
        Thread t = new Thread(obj);
        t.start();
        
        System.in.read();
        obj.stop = true;
    }
}
