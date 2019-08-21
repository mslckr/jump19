
public class ThreadRunner {
    public static void main(String[] args) {
        NumberCounter t1 = new NumberCounter();
        NumberCounter t2 = new NumberCounter();

        t1.start();
        t2.start();
    
    }
}