public class ThreadCommunicationPractice {
    public static void main(String[] args) {

        Box box = new Box();

        Thread t1 = new Thread(() -> {
            // try {
            // Thread.sleep(500);
            // } catch (Exception e) {
            // System.out.println("Exception in T-1 : " + e.getMessage());
            // }

            for (int i = 1; i <= 5; i++) {
                box.producer(i);
            }
        });

        Thread t2 = new Thread(() -> {
            // try {
            // Thread.sleep(1000);
            // } catch (Exception e) {
            // System.out.println("Exception in T-2 : " + e.getMessage());
            // }

            for (int i = 1; i <= 5; i++) {
                box.consumer();
            }
        });

        t1.start();
        t2.start();
    }
}

class Box {
    Integer item;
    boolean flag = false;

    synchronized public void producer(Integer value) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        item = value;
        flag = true;
        System.out.println("Producer produces : " + item);

        notifyAll();
    }

    synchronized public void consumer() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Consumer consumes : " + item);
        item = null;
        flag = false;

        notifyAll();
    }
}