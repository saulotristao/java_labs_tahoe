package part_10.part_10_b;

public class CustomThreads extends Thread {
    public CustomThreads(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10 ; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+ "is counting. Now at " + i + "of 10");

        }
    }
}
