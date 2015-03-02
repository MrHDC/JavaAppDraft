import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bakc {

    synchronized void print(int a, String n) throws InterruptedException {
        for (int i = 0; i<a; i++){
            Thread.sleep(200);
            System.out.println( n + " - " + (i + 1));
        }
    }

    public static void main(String[] args) {
        final Bakc bakc = new Bakc();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bakc.print(4,"A");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bakc.print(4,"B");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread1.start();

    }

}
