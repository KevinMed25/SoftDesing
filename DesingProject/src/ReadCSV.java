import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {

    private int cantidadAlumnos = 3;
    private String[][] alumno = new String[cantidadAlumnos][4];
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public ReadCSV() {

    }

    public boolean leerCSV(String path) {

        String line = "";

        try {

            FileReader reader = new FileReader(path);

            try (BufferedReader read = new BufferedReader(reader)) {
                for (int i = 0; i < cantidadAlumnos; i++) {

                    line = read.readLine();
                    String[] split = line.split(",");

                    for (int j = 0; j < split.length; j++) {

                        this.alumno[i][j] = split[j];
                        System.out.print(this.alumno[i][j] + " ");
                    }
                    System.out.println("");
                }
            }

            return true;

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return false;
    }

    String[][] getRecords() {
        return this.alumno;
    }

    public void convetir(String[] alumno) {

    }

    public ArrayList<Alumno> converir() {
        return this.listaAlumnos;
    }

}
