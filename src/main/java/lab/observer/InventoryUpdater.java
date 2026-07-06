package lab.observer;

public class InventoryUpdater implements OrderObserver {

    @Override
    public void onEvent(Order order, OrderEvent event) {
        System.out.println("Inventory updated for " + event);
    }
}