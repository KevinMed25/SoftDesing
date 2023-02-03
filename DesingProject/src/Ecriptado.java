import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ecriptado {

    String cadena = null;
    int cantidadUsuarios = 2;

    private void leerUsuarios() {

        File listaUsuarios = new File("src/docs/Sesiones.csv");
        try {

            FileReader reader = new FileReader(listaUsuarios);
            BufferedReader read = new BufferedReader(reader);

            for (int i = 0; i < cantidadUsuarios; i++) {

                cadena = read.readLine();
                String[] split = cadena.split(",");

                for (int j = 0; j < split.length; j++) {

                }
            }

        } catch (Exception e) {
            System.out.println("No existe el usuario" + e);
        }

    }

    public String getUsuario(String cadena) {

        return this.cadena;
    }

}
