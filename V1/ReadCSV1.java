import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Clase para leer un archivo csv y almacenarlo en una matriz
// Kevin Alejandro Medina Padilla
// Diseño de Software 

public class ReadCSV1 {

    private static int cantidadAlumnos = 3; // Al ser un array estatico, se debe indicar la cantidad de alumnos en la
                                            // lista
    private static String alumnos[][] = new String[cantidadAlumnos][4];

    public static boolean leerCSV(String path) {

        String line = "";

        try {

            FileReader reader = new FileReader(path);
            BufferedReader read = new BufferedReader(reader);

            for (int i = 0; i < cantidadAlumnos; i++) {
                line = read.readLine();
                getRecords(line, i);
            }

            return true;

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        return false;

    }

    public static String[][] getRecords(String line, int i) {

        String[] split = line.split(",");

        for (int j = 0; j < split.length; j++) {

            alumnos[i][j] = split[j];
            System.out.print(alumnos[i][j] + " ");

        }
        System.out.println("");

        return alumnos;
    }

    public static void main(String[] args) {
        String path = "lista.csv";
        leerCSV(path);
    }
}