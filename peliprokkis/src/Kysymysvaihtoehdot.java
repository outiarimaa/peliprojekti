public class Kysymysvaihtoehdot {
    private int id;
    private int kysymysid;
    private String teksti;
    private String oikeavastaus;

    public Kysymysvaihtoehdot() {
    }

    public Kysymysvaihtoehdot(int id, int kysymysid, String teksti, String oikeavastaus) {
        this.id = id;
        this.kysymysid = kysymysid;
        this.teksti = teksti;
        this.oikeavastaus = oikeavastaus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKysymysid() {
        return kysymysid;
    }

    public void setKysymysid(int kysymysid) {
        this.kysymysid = kysymysid;
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

    @java.lang.Override
    public java.lang.String toString() {
        return "Kysymysvaihtoehdot{" +
                "id=" + id +
                ", kysymysid=" + kysymysid +
                ", teksti='" + teksti + '\'' +
                ", oikeavastaus='" + oikeavastaus + '\'' +
                '}';
    }
}
