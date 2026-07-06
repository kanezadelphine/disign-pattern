package lab.strategy;

public class PaymentResult {
    private double finalAmount;

    public PaymentResult(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public double getFinalAmount() {
        return finalAmount;
    }
}