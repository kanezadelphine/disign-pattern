package lab.strategy;

public interface PaymentStrategy {
    PaymentResult process(PaymentRequest request);
}