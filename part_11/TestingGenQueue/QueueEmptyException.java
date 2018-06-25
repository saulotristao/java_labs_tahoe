package part_11.TestingGenQueue;

public class QueueEmptyException extends Exception {
    @Override
    public String getMessage() {
        return "Queue is empty";
    }
}
