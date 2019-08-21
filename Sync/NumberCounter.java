
public class NumberCounter extends Thread{
    
    @Override
    public synchronized void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " has started");

        for(int num = 0; num <= 10; num++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + num);
        }

        //super.run();
    }
}