public class CreadorPagoTransferencia extends CreadorPago {
    public Pago crearPago(double monto) {
        if (monto < 50.0) {
            System.out.println("Monto mínimo para Transferencia Bancaria: $50.0");
            return null;
        }
        return new PagoTransferencia();
    }
}