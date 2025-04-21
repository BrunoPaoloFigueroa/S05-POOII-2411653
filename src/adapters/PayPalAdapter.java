package adapters;

import interfaces.PaymentProcessor;
import providers.PayPal;

public class PayPalAdapter implements PaymentProcessor {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public boolean processPayment(double monto, String b) {
        return "realizado".equals(paypal.processPayment(monto, b));
    }
}