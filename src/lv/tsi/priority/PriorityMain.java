package lv.tsi.priority;

public class PriorityMain {
    public static void main(String[] args) {
        PriorityThread thr = new PriorityThread("max");
        PriorityThread thr2 = new PriorityThread("min");
        PriorityThread thr3 = new PriorityThread("norm");
        thr.setPriority(Thread.MAX_PRIORITY);
        thr2.setPriority(Thread.MIN_PRIORITY);
        thr3.setPriority(Thread.NORM_PRIORITY);
        thr.start();
        thr2.start();
        thr3.start();
    }
}
