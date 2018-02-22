import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Kyselijä {

    public void printtaaja() throws SQLException {
//    String sql = "insert into kysymykset";
        try {
            Connection con=new Kantakäsittelijä().getCon();
//            PreparedStatement ps = new Kantakäsittelijä().getCon().prepareStatement(sql);
            kysymykset(con);
            for (Kysymysvaihtoehdot a: kysymykset(con)) {
                System.out.println(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static List<Kysymysvaihtoehdot> kysymykset(Connection con) throws SQLException {
        PreparedStatement pstmt = con.prepareStatement("select * from kysymysvaihtoehdot");
        ResultSet rs = pstmt.executeQuery();
        List<Kysymysvaihtoehdot> kysymyslista = new ArrayList<>();
        while (rs.next()) {
            kysymyslista.add(new Kysymysvaihtoehdot(rs));
        }
        return kysymyslista;
    }

}

