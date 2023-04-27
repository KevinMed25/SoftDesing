package Principio2_solid;

public class Rectangulo {

    protected double largo;
    protected double ancho;

    public void setLargo(double _largo) {
        this.largo = _largo;
    }

    public void setAncho(double _ancho) {
        this.ancho = _ancho;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }
}
