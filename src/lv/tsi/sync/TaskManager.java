package lv.tsi.sync;

public class TaskManager {
    public synchronized void performTask(int taskId) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + taskId);
        Thread.sleep(4);
        System.out.println(Thread.currentThread().getName() + " " + taskId);
    }
}
