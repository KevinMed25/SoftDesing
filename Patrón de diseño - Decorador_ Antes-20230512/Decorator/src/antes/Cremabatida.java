package antes;

public class Cremabatida extends DecoradorBebida {
    public double costo() {
        return this.getBebida().costo() + 4;
    }
}
