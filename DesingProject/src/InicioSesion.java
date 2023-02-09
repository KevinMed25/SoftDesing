
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InicioSesion {
    String usuario;
    String contraseña;

    public void login() {

        System.out.println("Escriba el usuario: ");
        Scanner escaner = new Scanner(System.in);

        try {

            this.usuario = escaner.nextLine();

        } catch (InputMismatchException e) {

            System.out.println("No introdujiste un usuario válido");
        }

        System.out.println("Escriba la contraseña: ");

        try {

            this.contraseña = escaner.nextLine();

        } catch (InputMismatchException e) {

            System.out.println("introdujiste una contraseña incorrecta");
        }

        escaner.close();

        validarExistencia(this.usuario, this.contraseña);
    }

    public boolean validarExistencia(String usuario, String contraseña) {

        boolean isValid = false;

        File listaUsuarios = new File("src/docs/Sesiones.csv");

        try {

            FileReader reader = new FileReader(listaUsuarios);
            BufferedReader read = new BufferedReader(reader);

            String cadena = "";

            while (cadena != null) {

                cadena = read.readLine();
                cadena = Encrypted.Decryp(cadena);
                if (cadena == usuario + "," + contraseña) {
                    isValid = true;
                }

            }

        } catch (Exception e) {

            System.out.println("No hay ningun usuario registrado" + e);
        }

        return isValid;
    }

}
