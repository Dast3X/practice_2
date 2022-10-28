package lv.tsi.sync;

public class SyncMain {
    public static void main(String[] args) throws InterruptedException {
        final TaskManager tskm1 = new TaskManager();

        TaskThread thr1 = new TaskThread("Thread - 1",10, tskm1);
        TaskThread thr2 = new TaskThread("Thread - 2",20, tskm1);
        thr1.start();
        Thread.sleep(2);
        thr2.start();

    /*Output:
    *                           Thread - 1 10
    *                           Thread - 2 20
    *                           Thread - 1 10
    *                           Thread - 2 20
    *
    *Output for synchronized:
    *                           Thread - 1 10
    *                           Thread - 1 10
    *                           Thread - 2 20
    *                           Thread - 2 20
    */
    }
}
