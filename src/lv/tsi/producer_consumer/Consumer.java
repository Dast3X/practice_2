package lv.tsi.producer_consumer;

public class Consumer extends Thread {
    private Goods goods;

    Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true) {
            try {
                this.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int n = goods.consume();
            System.out.println("Consumed: " + n);

        }
    }
}
