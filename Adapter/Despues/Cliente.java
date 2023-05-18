package Despues;

public class Cliente {

    public void ejecutarPago(MedioPago medio, double monto) {
        medio.pagar(monto);
    }

    public static void main(String[] args) {
        Cliente cte = new Cliente();
        cte.ejecutarPago(new PayPalAdapter(), 100);
        cte.ejecutarPago(new PayPalAdapter(), 200);
        cte.ejecutarPago(new PayPalAdapter(), 500);
    }

}
