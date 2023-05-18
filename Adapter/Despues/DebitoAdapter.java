package Despues;

public class DebitoAdapter extends Debito implements MedioPago {

    public void pagar(double monto) {
        this.pagarDebito(monto);
    }
}
