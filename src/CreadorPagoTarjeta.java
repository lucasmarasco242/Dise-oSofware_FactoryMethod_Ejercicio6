public class CreadorPagoTarjeta extends CreadorPago {
    public Pago crearPago(double monto) {
        if (monto < 100.0) {
            System.out.println("Monto mínimo para Tarjeta de Crédito: $100.0");
            return null;
        }
        return new PagoTarjeta();
    }
}