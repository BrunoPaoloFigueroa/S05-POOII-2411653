package providers;

public class PayPal {
    public String processPayment(double monto, String b) {
        System.out.println("Procesando con PayPal: $" + monto + " " + b);
        return "success";
    }
}