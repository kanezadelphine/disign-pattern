package lab.observer;

public interface OrderObserver {
    void onEvent(Order order, OrderEvent event);
}