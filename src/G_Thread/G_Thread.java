package G_Thread;

public class G_Thread extends Thread{

    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
    G_Thread object = new G_Thread();
    object.start();
//    Start creates a new thread to run separately. start -> run -> thread.
    }
}
