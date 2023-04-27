package Principio2_solid;

import java.util.Hashtable;
import java.util.Properties;

public class Liskob {

    public Liskob(Hashtable<Object, Object> coleccion) {
        this.generarColeccion(coleccion);
    }

    public void generarColeccion(Hashtable<Object, Object> coleccion) {
        coleccion.put("primero", 1);
        coleccion.put("segundo", 2);
        System.out.println(coleccion.size());
        coleccion.remove("segundo");
        System.out.println(coleccion.size());
    }

    public static void main(String[] args) {
        Properties coleccion = new Properties();
        new Liskob(coleccion);
    }

}
