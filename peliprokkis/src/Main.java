import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

//        Scanner skanneri = new Scanner(System.in);
        System.out.println("Tervetuloa pelaamaan! Ohjelma esittää sinulle Java-aiheisia kysymyksiä");
        System.out.println("Sinun tulee vastata väittämiin joko oikein tai väärin.");
        System.out.println("Onnea peliin!");
        System.out.println("");

        Kyselijä kyselija = new Kyselijä();
        kyselija.printtaaja();



    }
}
