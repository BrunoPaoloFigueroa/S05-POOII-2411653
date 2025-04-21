package providers;

import java.util.HashMap;
import java.util.Map;

public class MercadoPago {
    public Map<String, Object> executePayment(double monto, String b) {
        System.out.println("Ejecutando pago con MercadoPago: $" + monto +" "+ b);
        Map<String, Object> response = new HashMap<>();
        response.put("status", "approved");
        return response;
    }
}