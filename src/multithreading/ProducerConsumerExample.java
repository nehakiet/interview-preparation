package multithreading;

class SharedResource {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // Wait if there's already data
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("multithreading.Producer interrupted");
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + data);
        notify(); // Notify the consumer that data is available
    }

    public synchronized void consume() {
        while (!hasData) {
            try {
                wait(); // Wait if there's no data
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("multithreading.Consumer interrupted");
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // Notify the producer that data has been consumed
    }
}

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(1000); // Simulate time taken to produce
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("multithreading.Producer sleep interrupted");
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.consume();
            try {
                Thread.sleep(1500); // Simulate time taken to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("multithreading.Consumer sleep interrupted");
            }
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}
