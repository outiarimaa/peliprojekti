import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Kantakäsittelijä {
    private Connection con;

    public Kantakäsittelijä() {
        if (con == null) {
            Kantakäsittelijä k = new Kantakäsittelijä();
            k.otaYhteys();
        }
    }

    private static void lataaAjuri() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Ajuri ladattu");
    }

    private void otaYhteys() {
        try {
            lataaAjuri();
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tietopeli?useSSL=false",
                            "yhteinen", "salasana");
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getCon() {
        return con;
    }
}
