package lab.strategy;

public class BankTransferStrategy implements PaymentStrategy {

    @Override
    public PaymentResult process(PaymentRequest request) {
        double fee = request.getAmount() * 0.01; // 1%
        return new PaymentResult(request.getAmount() + fee);
    }
}