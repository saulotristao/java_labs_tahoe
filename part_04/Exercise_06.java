package part_04;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */
class Exercise_06{
    public static void main(String[] args) {
        Queue exercise = new Queue(101);

        for (int i = 0; i <=100 ; i++) {
            exercise.put(i);
        }
        for (int j = 0  ; j <50; j++) {
            System.out.print(exercise.get()+",");
            exercise.get();
        }
        System.out.print(exercise.get()+",");
    }
}


class Queue {
    int q[]; // this array holds the queue
    int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new int [size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    public void put(int ch) {
        if(putloc==q.length) {
            System.out.println(" – Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // get a character from the queue
    int get() {
        if(getloc == putloc) {
            System.out.println(" – Queue is empty.");
            return (int) 0;
        }
        return q[getloc++];
    }
}