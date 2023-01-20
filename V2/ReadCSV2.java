import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV2 {

    private int cantidadAlumnos = 3;
    private String[][] alumno = new String[cantidadAlumnos][4];

    public ReadCSV2() {

    }

    public boolean leerCSV(String path) {

        String line = "";

        try {

            FileReader reader = new FileReader(path);
            BufferedReader read = new BufferedReader(reader);

            for (int i = 0; i < cantidadAlumnos; i++) {

                line = read.readLine();
                String[] split = line.split(",");

                for (int j = 0; j < split.length; j++) {

                    this.alumno[i][j] = split[j];
                    System.out.print(this.alumno[i][j] + " ");
                }
                System.out.println("");
            }

            return true;

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        return false;
    }

    private String[][] getRecords() {
        return this.alumno;
    }

    public static void main(String[] args) {

        String path = "C:/Users/kevin/Desktop/SoftDesing/V2/lista.csv";
        ReadCSV2 leer = new ReadCSV2();
        leer.leerCSV(path);
        leer.getRecords();

    }

}
