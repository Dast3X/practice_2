package lv.tsi.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingMain {
    public static void main(String[] args){
        final BlockingQueue<String> blockingQueue1 = new ArrayBlockingQueue<>(32);
        AddingThread addingThread = new AddingThread(blockingQueue1);
        TakingThread takingThread = new TakingThread(blockingQueue1);
        addingThread.start();
        takingThread.start();
    }
}
    // Queue get 3 strings in such order Element0, Element1, Element2.
    // The second Tread takes the first element of the queue, because it works by FIFO