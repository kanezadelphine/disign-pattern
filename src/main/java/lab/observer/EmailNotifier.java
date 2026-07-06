package lab.observer;

public class EmailNotifier implements OrderObserver {

    @Override
    public void onEvent(Order order, OrderEvent event) {
        System.out.println("Email sent for " + event);
    }
}