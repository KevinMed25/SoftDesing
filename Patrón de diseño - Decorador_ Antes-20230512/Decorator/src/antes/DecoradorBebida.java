package antes;

public abstract class DecoradorBebida extends Bebida {
    Bebida bebida;

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida _bebida) {
        this.bebida = _bebida;
    }
}
