import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CoffeeQueue {
    private int pendingOrders;

    Delay td = new Delay();

    public void setPendingOrders(int pendingOrders) {
        if (pendingOrders == 0) {
            System.out.print("Введите кол-во заказов\n");
            pendingOrders = InputHandler.readInt();
        } else {
            this.pendingOrders = pendingOrders;
        }
    }

    public synchronized void takeOrder() {
        if (pendingOrders > 0) {
            System.out.print("Бариста взял заказ" + Thread.currentThread().getName());
            td.timeDelay2();
            pendingOrders--;
        } else if (pendingOrders == 1) {
            System.out.print("Бариста взял последний заказ" + Thread.currentThread().getName());
            td.timeDelay2();
            pendingOrders--;
        }
    }

    public synchronized void obrabotka() {
        System.out.print("Сборка заказа" + Thread.currentThread().getName());
        td.timeDelay5();
    }

    public synchronized void getOrder() {
        System.out.print("Бариста отдал заказ" + Thread.currentThread().getName());
        td.timeDelay();
    }
}
