import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import static java.lang.Thread.sleep;

public class ProducerConsumerDemo {
    final Queue<Item> mBuffer = new LinkedList<>();
    final int MAX_SIZE = 10;
    final Random mRandom = new Random();

    public static void main(String[] args) {
        ProducerConsumerDemo demo = new ProducerConsumerDemo();
        demo.startWork();
    }

    public void startWork(){
        new Producer("P1").start();
        new Producer("P2").start();
        new Consumer("C1").start();
        new Consumer("C2").start();
    }

    class Producer extends Thread {
        public Producer(String s) {
            super(s);
        }

        @Override
        public void run() {
            while (true) {
                sleepSomeTime();
                synchronized (mBuffer) {
                    if (mBuffer.size() < MAX_SIZE) {
                        mBuffer.offer(new Item());
                        print(getName() + " produce an item, now buffer has " + mBuffer.size() + " item");
                        mBuffer.notifyAll();
                    }
                }
            }
        }
    }

    class Consumer extends Thread {

        public Consumer(String s) {
            super(s);
        }

        @Override
        public void run() {
            while (true) {
                sleepSomeTime();
                synchronized (mBuffer) {
                    if (mBuffer.size() > 0) {
                        mBuffer.poll();
                        print(getName() + " consume an item, now buffer has " + mBuffer.size() + " item");
                    } else {
                        try {
                            mBuffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    class Item{
    }


    void sleepSomeTime(){
        try {
            sleep(mRandom.nextInt(50));
        } catch (InterruptedException e) {

        }
    }

    void print(String s){
        System.out.println(s);
    }
}

