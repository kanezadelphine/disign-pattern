package lab.observer;
public class AuditLogger implements OrderObserver {

    @Override
    public void onEvent(Order order, OrderEvent event) {
        System.out.println("Audit log saved for " + event);
    }
}