import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Kyselijä {


    String sql = "insert into kysymykset";
        try {
        PreparedStatement ps = new Kantakäsittelijä().getCon().prepareStatement(sql);

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
