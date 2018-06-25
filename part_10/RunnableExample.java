package part_10;

public class RunnableExample implements Runnable{
    Thread thread;

    public RunnableExample(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {

    }
}
