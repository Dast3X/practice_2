package lv.tsi.sync;

public class TaskThread extends Thread{
    private TaskManager task;
    private int taskId;
    public TaskThread(String threadName, int taskId, TaskManager task){
        super(threadName);
        this.taskId = taskId;
        this.task = task;
    }
    @Override
    public void run() {
        try {
            task.performTask(taskId);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
