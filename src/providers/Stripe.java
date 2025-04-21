package providers;

public class Stripe {
    public boolean charge(double monto, String b) {
        System.out.println("Cobrando con Stripe: $" + monto+" "+ b);
        return true;
    }
}
