package lv.tsi.priority;

public class PriorityThread extends Thread {
    public PriorityThread(String threadName) {
        super(threadName);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println(getName() + " - " + (i + 1));
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
