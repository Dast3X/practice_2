package lv.tsi.producer_consumer;

import java.util.Random;

public class Producer extends Thread {
    private Goods goods;

    Producer(Goods goods) {
        this.goods = goods;
    }
    @Override
    public void run(){
        Random random = new Random();
        while(true) {
            int n = random.nextInt(40);
            goods.produce(n);
            System.out.println("Produced: " + n);
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
