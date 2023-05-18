package Despues;

public class CreditoAdapter extends Credito implements MedioPago {
    public void pagar(double monto) {
        this.pagarCredito(monto);
    }
}
