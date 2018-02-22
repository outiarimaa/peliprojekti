public class Kysymys {
    private int id;
    private String teksti;

    public Kysymys(){

    }

    public Kysymys(int id, String teksti) {
        this.id = id;
        this.teksti = teksti;
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

    @Override
    public String toString() {
        return "Kysymys{" +
                "id=" + id +
                ", teksti='" + teksti + '\'' +
                '}';
    }
}
