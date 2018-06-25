package part_11.TestingGenQueue;

import part_11.TestingGenQueue.GenericQueue;

/**
 * Modify your Queue Class so that it is completely generic
 */
public class Exercise_03 {

    public static void main(String[] args) {
        GenericQueue<Integer> queueTestIntergers = new GenericQueue<>(10);
        GenericQueue<String> queueTestGeneric = new GenericQueue<>(12);

        for (int i = 0; i < 13 ; i++) {
            try {
                queueTestIntergers.put(i);
            } catch (QueueFullException e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i <10 ; i++) {
            try {
                System.out.println(queueTestIntergers.get());
            } catch (QueueEmptyException e) {
                System.out.println(e.getMessage());
            }
        }

        String[] arrayString = {"hello", "World", "brazil", "won", "today","tyui","rty", "ertyu", "ertyui"};
        for (String a: arrayString) {
            try {
                queueTestGeneric.put(a);
            } catch (QueueFullException e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i <10 ; i++) {
            try {
                System.out.println(queueTestGeneric.get());
            } catch (QueueEmptyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

