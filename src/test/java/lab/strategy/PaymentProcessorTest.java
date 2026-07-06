package lab.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {

    @Test
    void testStrategies() {
        PaymentRequest request = new PaymentRequest(100);

        PaymentProcessor processor = new PaymentProcessor(new CreditCardStrategy());
        assertEquals(103, processor.process(request).getFinalAmount());

        processor.setStrategy(new BankTransferStrategy());
        assertEquals(101, processor.process(request).getFinalAmount());

        processor.setStrategy(new MobileMoneyStrategy());
        assertEquals(102, processor.process(request).getFinalAmount());
    }
}