import java.sql.ResultSet;
import java.sql.SQLException;

public class Kysymysvaihtoehdot {
    private int id;
    private String teksti;
    private String oikeavastaus;

    public Kysymysvaihtoehdot() {
    }

    public Kysymysvaihtoehdot(int id, int kysymysid, String teksti, String oikeavastaus) {
        this.id = id;
        this.teksti = teksti;
        this.oikeavastaus = oikeavastaus;
    }

    public Kysymysvaihtoehdot(ResultSet rs) throws SQLException {
        Kysymysvaihtoehdot o = this;
        o.setId(rs.getInt("id"));
        o.setTeksti(rs.getString("teksti"));
        o.setOikeavastaus(rs.getString("oikeavastaus"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeksti() {
        return teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    public String getOikeavastaus() {
        return oikeavastaus;
    }

    public void setOikeavastaus(String oikeavastaus) {
        this.oikeavastaus = oikeavastaus;
    }

    @Override
    public String toString() {
        return "Kysymysvaihtoehdot{" +
                "id=" + id +
                ", teksti='" + teksti + '\'' +
                ", oikeavastaus='" + oikeavastaus + '\'' +
                '}';
    }
}

