package adapters;

import interfaces.PaymentProcessor;
import providers.Stripe;

public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public boolean processPayment(double monto, String b) {
        return stripe.charge(monto,b);
    }
}