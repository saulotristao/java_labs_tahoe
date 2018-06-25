package part_11.TestingGenQueue;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    @Override
    public String getMessage() {
        return "Queue size is " + size;
    }
}
