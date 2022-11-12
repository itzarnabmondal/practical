public class ByExtendingThread extends Thread 
{
    public void run() // Overridding run method
    {
        System.out.println("Run method executed by child Thread");
    }
    public static void main(String[] args)
    {
        Test t = new Test();
        t.start(); // Starting Thread
        System.out.println("Main method executed by main thread");
    }
}
