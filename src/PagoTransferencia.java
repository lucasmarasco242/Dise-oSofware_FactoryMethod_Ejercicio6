public class PagoTransferencia implements Pago {
    public String cobrar(double monto) {
        return "Comprobante Transferencia Bancaria -> Total cobrado: $" + monto;
    }
}