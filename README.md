Ejercicio 6 - Factoría de Métodos de Pago para Comercio Electrónico

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para procesar pagos con Tarjeta de Crédito, Transferencia Bancaria y Monedero Digital aplicando montos mínimos de validación en cada factoría y devolviendo un comprobante de transacción, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz Pago con el método cobrar(double monto) que devuelve un comprobante en formato String.
- Tres clases concretas (PagoTarjeta, PagoTransferencia y PagoMonedero) que aplican sus reglas de recargo o cobro.
- Una clase abstracta CreadorPago con el método de fábrica crearPago(double monto).
- Tres clases creadoras concretas (CreadorPagoTarjeta, CreadorPagoTransferencia y CreadorPagoMonedero) que validan el monto mínimo y devuelven el método de pago correspondiente.

Luego, dentro del método main, se utilizan las factorías para crear cada pago y mostrar su comprobante.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común Pago que devuelva un comprobante al cobrar.
- Validar el monto mínimo dentro de cada subclase creadora antes de instanciar la pasarela.
- Aplicar las reglas de comisión o recargo dentro de cada clase concreta de pago.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
Comprobante Tarjeta de Crédito -> Total cobrado: $1050.0
Comprobante Transferencia Bancaria -> Total cobrado: $500.0
Comprobante Monedero Digital -> Total cobrado: $204.0

Captura de pantalla

<img width="622" height="186" alt="image" src="https://github.com/user-attachments/assets/be6f87c0-1abc-4fc1-aaa9-6c071e622d11" />
