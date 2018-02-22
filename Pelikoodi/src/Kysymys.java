package fi.academy;

import java.util.List;

public class Kysymys {

    String kysymysteksti;
    List<String> vastausvaihtoehdot;
    int oikeanVaihtoehdonIndeksi;


    public Kysymys(String kysymysteksti, List<String> vastausvaihtoehdot, int oikeanVaihtoehdonIndeksi) {
        this.kysymysteksti = kysymysteksti;
        this.vastausvaihtoehdot = vastausvaihtoehdot;
        this.oikeanVaihtoehdonIndeksi = oikeanVaihtoehdonIndeksi;
    }

    public String getKysymysteksti() {
        return kysymysteksti;
    }

    public String getVastausvaihtoehdot() {
        String palautettava = "";
        for (int i = 0; i<vastausvaihtoehdot.size();i++) {
            palautettava += String.format("(%d)  %s%n",(i+1),vastausvaihtoehdot.get(i));
        }
        return palautettava;
    }

    public int getOikeanVaihtoehdonIndeksi() {
        return oikeanVaihtoehdonIndeksi;
    }

    public int getVaihtoehtojenMaara () {
        return vastausvaihtoehdot.size();
    }

    public void setKysymysteksti(String kysymysteksti) {
        this.kysymysteksti = kysymysteksti;
    }

    public void setVastausvaihtoehdot(List<String> vastausvaihtoehdot) {
        this.vastausvaihtoehdot = vastausvaihtoehdot;
    }

    public void setOikeanVaihtoehdonIndeksi(int oikeanVaihtoehdonIndeksi) {
        this.oikeanVaihtoehdonIndeksi = oikeanVaihtoehdonIndeksi;
    }
}
