import java.util.Random;
public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer();
        Thread producer = new Thread(new Producer(buffer), "Producer");
        Thread consumer = new Thread(new Consumer(buffer), "Consumer");
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("Both Producer and Consumer have finished.");
    }
    static class Buffer {
        private Integer value = null;
        private boolean finished = false;
        public synchronized void put(int v) throws InterruptedException {
            while (value != null) wait(); 
            value = v;
            notifyAll();
        }
        public synchronized Integer get() throws InterruptedException {
            while (value == null && !finished) wait(); 
            Integer ret = value;
            value = null;
            notifyAll();
            return ret;
        }
        public synchronized void setFinished() {
            finished = true;
            notifyAll();
        }
    }
    static class Producer implements Runnable {
        private final Buffer buffer;
        private final Random rand = new Random();
        Producer(Buffer buffer) { this.buffer = buffer; }
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    int num = rand.nextInt(100) + 1;
                    buffer.put(num);
                    System.out.println("Producer produced: " + num);
                    Thread.sleep(100); 
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                buffer.setFinished();
            }
        }
    }
    static class Consumer implements Runnable {
        private final Buffer buffer;
        Consumer(Buffer buffer) { this.buffer = buffer; }
        @Override
        public void run() {
            int evenCount = 0;
            try {
                while (true) {
                    Integer val = buffer.get();
                    if (val == null) {
                        synchronized (buffer) {
                            if (true) break;
                        }
                    } else {
                        System.out.println("Consumer received: " + val + " -> " + (val % 2 == 0 ? "Even" : "Odd"));
                        if (val % 2 == 0) evenCount++;
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Consumer processed all numbers. Total even numbers = " + evenCount);
        }
    }
}



