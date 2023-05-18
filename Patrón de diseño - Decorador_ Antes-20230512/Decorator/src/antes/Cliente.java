package antes;
// import antes.Bebida;

public class Cliente {

    public Cliente() {
        Bebida decaf = new Decaf();
        DecoradorBebida soya = new Soya();
        soya.setBebida(decaf);
        DecoradorBebida crema = new Cremabatida();
        crema.setBebida(decaf);
        DecoradorBebida crema2 = new Cremabatida();
        crema2.setBebida(decaf);
        System.out.println(decaf.costo());
    }

    public static void main(String[] args) {
        new Cliente();
    }
}
