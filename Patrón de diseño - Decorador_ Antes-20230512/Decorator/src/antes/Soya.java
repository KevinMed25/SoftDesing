package antes;

public class Soya extends DecoradorBebida {
    public double costo() {
        return this.getBebida().costo() + 2;
    }
}
