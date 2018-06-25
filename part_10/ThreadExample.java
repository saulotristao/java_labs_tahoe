package part_10;

import javax.sound.midi.Soundbank;

public class ThreadExample extends Thread {
    public ThreadExample (String name){
        setName(name);

        // the thread class calls your run() after you call start();
        //start();
    }

    //whatever is in the run() ius what will execute on the thread

    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "is on count "+ i );
        }
        example(getName());

    }

    public void example (String name){
        System.out.println("Example" + name);
    }

}
