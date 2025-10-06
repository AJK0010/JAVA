class OddThread extends Thread {
    private int limit;

    OddThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

class EvenThread extends Thread {
    private int limit;

    EvenThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Even numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

public class ex7 {
    public static void main(String[] args) {
        int range = 20; // you can change the range here

        OddThread t1 = new OddThread(range);
        EvenThread t2 = new EvenThread(range);

        t1.start(); // Start odd number thread
        t2.start(); // Start even number thread
    }
}
