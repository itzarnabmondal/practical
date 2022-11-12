public class ByImplementingRunnable implements Runnable {
    public void run() // Overriding run
    {
        System.out.println("Run method executed by child Thread");
    }
    public static void main(String[] args)
    {
        ByImplementingRunnable t = new ByImplementingRunnable();
        t.m1();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("Main method executed by main thread");
    }
}
