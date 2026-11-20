public class PagoMonedero implements Pago {
    public String cobrar(double monto) {
        double total = monto * 1.02;
        return "Comprobante Monedero Digital -> Total cobrado: $" + total;
    }
}