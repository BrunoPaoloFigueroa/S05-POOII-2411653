import adapters.PayPalAdapter;
import adapters.StripeAdapter;
import adapters.MercadoPagoAdapter;
import interfaces.PaymentProcessor;
import providers.PayPal;
import providers.Stripe;
import providers.MercadoPago;
public class Main {

    public static void main(String[] args) {
        PaymentProcessor stripe = new StripeAdapter(new Stripe());
        PaymentProcessor paypal = new PayPalAdapter(new PayPal());
        PaymentProcessor mercadoPago = new MercadoPagoAdapter(new MercadoPago());

        stripe.processPayment(100.0, "SOLES");
        paypal.processPayment(50.0, "NUEVOS SOLES");
        mercadoPago.processPayment(75.0, "INTIS");
    }
}
