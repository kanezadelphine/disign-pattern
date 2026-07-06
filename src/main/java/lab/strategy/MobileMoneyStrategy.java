package lab.strategy;

public class MobileMoneyStrategy implements PaymentStrategy {

    @Override
    public PaymentResult process(PaymentRequest request) {
        double fee = request.getAmount() * 0.02; // 2%
        return new PaymentResult(request.getAmount() + fee);
    }
}