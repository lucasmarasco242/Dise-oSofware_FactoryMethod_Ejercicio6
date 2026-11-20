public class CreadorPagoMonedero extends CreadorPago {
    public Pago crearPago(double monto) {
        if (monto < 10.0) {
            System.out.println("Monto mínimo para Monedero Digital: $10.0");
            return null;
        }
        return new PagoMonedero();
    }
}