package adapters;

import interfaces.PaymentProcessor;
import providers.MercadoPago;

import java.util.Map;

public class MercadoPagoAdapter implements PaymentProcessor {
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }


    @Override
    public boolean processPayment(double monto, String b) {
        Map<String, Object> result = mercadoPago.executePayment(monto, b);
        return "approved".equals(result.get("status"));
    }
}