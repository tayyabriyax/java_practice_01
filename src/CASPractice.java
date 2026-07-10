import java.util.concurrent.atomic.AtomicReferenceArray;

public class CASPractice {
    public static void main(String[] args) {

        SeatBooker seatBooker = new SeatBooker();

        Thread t1 = new Thread(() -> seatBooker.bookSeat("Tayyab Riaz"));
        Thread t2 = new Thread(() -> seatBooker.bookSeat("Hammad Ahmad"));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class SeatBooker {
    String[] seatsArray = { "Empty", "Empty" };

    AtomicReferenceArray<String> seats = new AtomicReferenceArray<>(seatsArray);

    public void bookSeat(String name) {
        for (int i = 0; i < seats.length(); i++) {
            if (seats.compareAndSet(i, "Empty", name)) {
                System.out.println(name + " booked seat " + i);
                return;
            }
        }
        System.out.println(name + " could not book a seat.");
    }
}