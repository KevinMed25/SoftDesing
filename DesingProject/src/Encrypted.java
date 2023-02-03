
import java.io.IOException;
import java.util.Base64;

public class Encrypted {

    public static String Encryp(String Credentials) {

        try {

            String code = Base64.getEncoder().encodeToString(Credentials.getBytes());
            return code;

        } catch (Exception ex) {
            return "";
        }
    }

    public static String Decryp(String Credentials) {

        try {

            byte[] decryptedBytes = Base64.getDecoder().decode(Credentials);
            String decryptedString = new String(decryptedBytes);

            return decryptedString;

        } catch (Exception ex) {

            return "";

        }

    }

    /* FIRST TEST */

    public static void main(String Args[]) throws IOException {

        // System.out.println( Encryp(Credentials.getURL()));
        // System.out.println( Encryp(Credentials.getUsername()));
        // System.out.println( Encryp(Credentials.getPassword()));

        // System.out.println(Decryp(Credentials.getURL()));
        // System.out.println(Decryp(Credentials.getUsername()));
        // System.out.println(Decryp(Credentials.getPassword()));

    }

    /*
     * ORIGINAL CREDENTIALS:
     * 
     * jdbc:mysql://sql9.freesqldatabase.com
     * sql9563060
     * LuE7SFwuJK
     * 
     */
}
