public class Main {
    public static void main(String[] args) {
        CreadorPago creadorTarjeta = new CreadorPagoTarjeta();
        Pago pago1 = creadorTarjeta.crearPago(1000.0);
        if (pago1 != null) {
            System.out.println(pago1.cobrar(1000.0));
        }

        CreadorPago creadorTransferencia = new CreadorPagoTransferencia();
        Pago pago2 = creadorTransferencia.crearPago(500.0);
        if (pago2 != null) {
            System.out.println(pago2.cobrar(500.0));
        }

        CreadorPago creadorMonedero = new CreadorPagoMonedero();
        Pago pago3 = creadorMonedero.crearPago(200.0);
        if (pago3 != null) {
            System.out.println(pago3.cobrar(200.0));
        }
    }
}