package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread {
    private BlockingQueue<String> blockedQueue;

    AddingThread(BlockingQueue<String> blockedQueue) {
        this.blockedQueue = blockedQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; ++i) {
            var threadName = "Added Element"+i;
            blockedQueue.add(threadName);
            System.out.println(threadName);
        }
    }
}
