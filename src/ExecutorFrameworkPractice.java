import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkPractice{
    public static void main(String[] args) {
        
        // ExecutorService executor = Executors.newFixedThreadPool(2);

        // executor.submit(() -> System.out.println("Task-1 is executed by " + Thread.currentThread().getName()));
        // executor.submit(() -> System.out.println("Task-2 is executed by " + Thread.currentThread().getName()));
        // executor.submit(() -> System.out.println("Task-3 is executed by " + Thread.currentThread().getName()));
        // executor.submit(() -> System.out.println("Task-4 is executed by " + Thread.currentThread().getName()));

        // executor.shutdown();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> System.out.println("Task-1 is executed by " + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task-2 is executed by " + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task-3 is executed by " + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task-4 is executed by " + Thread.currentThread().getName()));

        executor.shutdown();

    }
}