public class PagoTarjeta implements Pago {
    public String cobrar(double monto) {
        double total = monto * 1.05;
        return "Comprobante Tarjeta de Crédito -> Total cobrado: $" + total;
    }
}