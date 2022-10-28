package lv.tsi.producer_consumer;

public class Goods {
    public int amount;

    public synchronized void produce(int amount) {

        while (this.amount != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.amount = amount;
        notify();
    }

    public synchronized int consume() {
        while (amount == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int temp = amount;
        amount = 0;
        notify();
        return temp;
    }
}
