import java.lang.Runnable;

public class Thread1 implements Runnable {
    String name;
    public Thread1(String name) {
        this.name=name;
    }
    public void run() {
        for (int i = 0; i<201; i++) {
            System.out.printf("[%s] %d", name, i);
        }
    }
}