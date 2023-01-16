import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Clase para leer un archivo csv y almacenarlo en una matriz

public class ReadCSV {

    String nombre = null;
    String apellidoMaterno = null;
    String apellidoPaterno = null;
    String matricula = null;

    String[][][][] alumno = new String[matricula.length()][nombre.length()][apellidoPaterno.length()][apellidoMaterno
            .length()];

    public static void readString() throws IOException {

        File lista = new File("lista.csv");

        FileReader reader = new FileReader(lista);
        BufferedReader read = new BufferedReader(reader);

    }

}