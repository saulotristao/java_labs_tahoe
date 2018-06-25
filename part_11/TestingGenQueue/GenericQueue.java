package part_11.TestingGenQueue;

class GenericQueue <T> {
    T[] q; // this array holds the queue
    int putloc, getloc; // the put and get indices
    int size;

    GenericQueue(int size) {
        this.size = size;
        q = (T[]) new Object[size];  // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    public void put(T a) throws QueueFullException {
        if(putloc==q.length) {
            throw new QueueFullException(size);
        }
        q[putloc++] = a;
    }

    // get a character from the queue
    T get() throws QueueEmptyException{
        if(getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}