package utilities;

public class Waiter {

    public static void waiting(double seconds){
        try {
            Thread.sleep((long) seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
