import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kyselijä {

    Scanner skanneri = new Scanner(System.in);

    public void printtaaja() throws SQLException {
//    String sql = "insert into kysymykset";
        try {
            Connection con=new Kantakäsittelijä().getCon();
//            PreparedStatement ps = new Kantakäsittelijä().getCon().prepareStatement(sql);
            kysymykset(con);
            uusiKyselija(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void uusiKyselija(Connection con) throws SQLException {
        List<Kysymysvaihtoehdot> l = kysymykset(con);
        for (Kysymysvaihtoehdot k : l) {
            System.out.println("Väittämä: ");
            System.out.println(k.getTeksti());
            System.out.println("Onko väittämä totta? (T / F)");
            String vastaus = skanneri.nextLine();
            if (vastaus.equals(k.getOikeavastaus())) {
                System.out.println("Oikein!!!");
            } else {
                System.out.println("Väärin. Boo!");
            }
            System.out.println("");
        }

        System.out.println("Peli päättyi.");
    }



    public static List<Kysymysvaihtoehdot> kysymykset(Connection con) throws SQLException {
        PreparedStatement pstmt = con.prepareStatement("select* from kysymysvaihtoehdot");
        ResultSet rs = pstmt.executeQuery();
        List<Kysymysvaihtoehdot> kysymyslista = new ArrayList<>();
        while (rs.next()) {
            kysymyslista.add(new Kysymysvaihtoehdot(rs));
        }
        return kysymyslista;
    }

}

