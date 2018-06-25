package part_10.part_10_b;

public class RunnableThreads implements Runnable {
    Thread thread;

    public RunnableThreads(String name) {
        thread = new Thread(this,name);
        thread.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName()+ "is counting. Now at " + i + "of 10");

        }
    }
}
