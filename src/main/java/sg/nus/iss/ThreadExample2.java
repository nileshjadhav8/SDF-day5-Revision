package sg.nus.iss;

public class ThreadExample2 implements Runnable{

    private String message;

    public ThreadExample2(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Thread 2" + message);
        
    }
    
}
