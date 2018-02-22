import sun.security.krb5.internal.PAData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LueTiedosto {
    public static void main(String[] args) {
        String nimi = "VLueTiedosto.java";
        String polku = "src/";
        try {
            LueTiedosto(nimi,polku);
        } catch (OmaPoikkeus e) {
            System.err.println("Mainissa ongelma: " + e.getMessage());
        }
    }

    public static void luetiedosto(String nimi , String polku) throws IOException {
        Path tiedosto = Paths.get(polku, nimi);
        List<String> rivit;
        try {
            rivit = Files.readAllLines(tiedosto);
        } catch (IOException e) {
            System.err.println("Saatiin poikkeus kiinni, heitetään eteenpäin.") {
                    throw new OmaPoikkeus(e);
                }
            }
    }
}

class OmaPoikkeus extends Exception {
    public OmaPoikkeus() {
        System.err.println("Virhe");

    }
}
