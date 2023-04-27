package Principio2_solid;

//Principio Liskov
public class Lanzador {

    public Lanzador(Rectangulo rect) {
        rect.setAncho(3);
        rect.setLargo(2);
        System.out.println("Area = " + rect.calcularArea());
    }

    public static void main(String[] args) {
        new Lanzador(new Cuadrado());
    }

}
