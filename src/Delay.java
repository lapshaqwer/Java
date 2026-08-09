import java.util.concurrent.TimeUnit;

public class Delay {
    public void timeDelay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Ожидание прервано");
        }
    }
}
