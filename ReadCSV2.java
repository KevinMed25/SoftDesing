import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV2 {

    private static int cantidadAlumnos = 3;

    public static boolean leerCSV(String path) {

        String line = "";
        String[][] aux = new String[cantidadAlumnos][4];

        try {

            FileReader reader = new FileReader(path);
            BufferedReader read = new BufferedReader(reader);

            for (int i = 0; i < cantidadAlumnos; i++) {

                line = read.readLine();
                String[] split = line.split(",");

                for (int j = 0; j < split.length; j++) {

                    aux[i][j] = split[j];

                    // System.out.print(aux[i][j] + " ");
                }
                // System.out.println("");

            }

            return true;

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        return false;
    }

    private String[][] getRecords() {

        String[][] alumnos = new String[cantidadAlumnos][4];
        return alumnos;
    }

    public static void main(String[] args) {

        String path = "lista.csv";
        leerCSV(path);
    }

}
