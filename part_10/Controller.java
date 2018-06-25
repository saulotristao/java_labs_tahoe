package part_10;

public class Controller {

    public static void main(String[] args) throws InterruptedException {
        System.out.println( "Starting main thread ...");

        ThreadExample t1 = new ThreadExample("thread-1");
        ThreadExample t2 = new ThreadExample("thread-2");
        ThreadExample t3 = new ThreadExample("thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread completed");
    }
}
