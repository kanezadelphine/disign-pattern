package lab.observer;

import org.junit.jupiter.api.Test;

public class OrderEventBusTest {

    @Test
    void testObservers() {
        Order order = new Order("ORD-101");

        OrderEventBus bus = new OrderEventBus();
        bus.subscribe(new EmailNotifier());
        bus.subscribe(new InventoryUpdater());
        bus.subscribe(new AuditLogger());

        bus.publish(order, OrderEvent.ORDER_PLACED);
    }
}