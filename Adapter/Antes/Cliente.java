package Antes;

public class Cliente {

    public void ejecutarPago(String tipo, double monto) {
        if (tipo.equalsIgnoreCase("debito")) {
            new Debito().pagarDebito(monto);
        } else if (tipo.equalsIgnoreCase("credito")) {
            new Credito().pagarCredito(monto);
        } else if (tipo.equalsIgnoreCase("paypal")) {
            new Paypal().paypal(monto);
        }

    }

    public Cliente() {

    }

    public static void main(String[] args) {
        Cliente cte = new Cliente();
        cte.ejecutarPago("debito", 100.0);
    }

}
