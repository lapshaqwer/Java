import java.util.concurrent.TimeUnit;

public class Delay {
    public void timeDelay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Ожидание прервано");
        }
    }

    public void timeDelay2() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println("Ожидание прервано");
        }
    }

    public void timeDelay5() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("Ожидание прервано");
        }
    }
}
