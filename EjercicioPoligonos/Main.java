class Main{

    public static void main(String[] args) {
        
        Punto pto1 = new Punto();
        Punto pto2 = new Punto();
        Punto pto3 = new Punto();
        Punto pto4 = new Punto();

        Poligono p1 = new Poligono();

        pto1.setX(-5);
        pto1.setY(5);

        pto2.setX(-5);
        pto2.setY(-5);

        pto3.setX(5);
        pto3.setY(-5);

        pto4.setX(5);
        pto4.setY(5);

        p1.addPunto(pto1);
        p1.addPunto(pto2);
        p1.addPunto(pto3);
        p1.addPunto(pto4);

    }

}