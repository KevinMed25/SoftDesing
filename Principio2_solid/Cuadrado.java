package Principio2_solid;

public class Cuadrado extends Rectangulo {

    public void setLargo(double _largo) {
        this.largo = _largo;
        this.ancho = _largo;

    }

    public void setAncho(double _ancho) {
        this.ancho = _ancho;
        this.largo = _ancho;
    }

}
