public class MultithreadingPractice {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Thread currenThread = Thread.currentThread();

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Exception while sleeping Thread : " + e.getMessage());
            }

            for (int i = 1; i <= 5; i++) {
                System.out.println(currenThread.getName() + "'s state is " + currenThread.getState());
            }
        });

        Thread t2 = new Thread(() -> {
            Thread currenThread = Thread.currentThread();

            for (int i = 1; i <= 5; i++) {
                System.out.println(currenThread.getName() + "'s state is " + currenThread.getState());
            }
        });

        // System.out.println(t1.getName() + "'s state is " + t1.getState());

        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName() + "'s state is " + Thread.currentThread().getState());
    }
}