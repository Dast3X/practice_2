package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread {
    private BlockingQueue<String> blockedQueue;
    TakingThread(BlockingQueue<String> blockedQueue){
        this.blockedQueue = blockedQueue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(blockedQueue.take());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
