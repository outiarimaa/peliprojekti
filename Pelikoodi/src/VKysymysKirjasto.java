package fi.academy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//listataan tänne kysymykset ja luodaan yhteen listiin

public class KysymysKirjasto {

    private List<Kysymys> kysymysLista;

    public KysymysKirjasto() {
        this.kysymysLista = new ArrayList<>();
    }

    public Kysymys haeUusiKysymys(int i) {
        return kysymysLista.get(i);
    }

    public void haeTiedostosta(String nimi, String polku) {
        Path tiedosto = Paths.get(polku,nimi);
        try {
            List<String> rivit = Files.readAllLines(tiedosto);
            if (!(rivit.isEmpty())) {
                for (String rivi : rivit) {
                    List<String> osat = Arrays.asList(rivi.split(";"));
                    int haettavanLoppu = osat.size()-1;

                    List<String> vaihtoehdot = osat.subList(1, haettavanLoppu);
                    int oikeaVastaus = Integer.parseInt(osat.get(osat.size()-1));

                    kysymysLista.add(new Kysymys(osat.get(0), vaihtoehdot, oikeaVastaus));
                }
                Collections.shuffle(kysymysLista);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Tiedostoa ei löydy");
        } catch (IOException ex) {
            System.out.println("Virhe luettaessa tiedostoa");
        }
    }
}

