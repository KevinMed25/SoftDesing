package Despues;

public class PayPalAdapter implements MedioPago {

    Paypal paypal = new Paypal();

    public void pagar(double monto) {
        this.paypal.paypal(monto);
    }
}
