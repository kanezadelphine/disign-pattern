package lab.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public PaymentResult process(PaymentRequest request) {
        double fee = request.getAmount() * 0.03; // 3%
        return new PaymentResult(request.getAmount() + fee);
    }
}