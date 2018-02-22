package fi.academy;

import java.util.Scanner;

public class Main {

    private static final Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {

        KysymysKirjasto nykyisetKysymykset = new KysymysKirjasto();
        //nykyisetKysymykset.luoKysymykset();
        nykyisetKysymykset.haeTiedostosta("Kysymykset.txt","src/fi/academy/");

        int pisteet = 0, kierros = 0;

        tulostaAlku();

        while (kierros < 10) {
            Kysymys uusi = nykyisetKysymykset.haeUusiKysymys(kierros);

            System.out.println(uusi.getKysymysteksti());
            System.out.println(uusi.getVastausvaihtoehdot());

            System.out.println("Anna vastaus kysymykseen " + (kierros + 1) + "/10: ");
            int vastaus = lueValinta(uusi.getVaihtoehtojenMaara())-1;
            if (vastaus == uusi.getOikeanVaihtoehdonIndeksi()) {
                System.out.println("OIKEIN! + 1p");
                pisteet++;
            } else {
                System.out.println("VÄÄRIN!");
            }
            System.out.println("");
            kierros++;
        }
        System.out.println(tulostaLopetus(pisteet));
    }

    static String tulostaLopetus(int pisteet) {
        if (pisteet > 8) {
            return String.format("Mahtavaa, hienosti meni!%nPisteet: %d/10", pisteet);
        } else if (pisteet > 6) {
            return String.format("Kiitos pelaamisesta, jokainen arpa häviää vain kerran!%nPisteet: %d/10", pisteet);
        } else {
            return String.format("Kiitos pelaamisesta, uusinta ensi viikolla!%nPisteet: %d/10", pisteet);
        }
    }

    static int lueValinta(int vaihtoehtojenMaara) {
        do {
            int tarjottu = 0;
            if (lukija.hasNextInt()) {
                tarjottu = lukija.nextInt();
            }
            lukija.nextLine();
            if (tarjottu > 0 && tarjottu <= vaihtoehtojenMaara) {
                return tarjottu;
            }
            System.out.println("Valitse jokin annetuista vaihtoehdoista");
        } while (true);
    }

    static void tulostaAlku() {
        System.out.println("Tervetuloa pelaamaan!\n");
        System.out.println("* Pelissä on 15 ohjelmointiin liittyvää kysymystä, joista ohjelma arpoo sattumanvaraisesti 10 kysymystä listalle.");
        System.out.println("* Näihin 10 kysymykseen on aina 2-4 vastausvaihtoehtoa. Kysymykseen tulee siis vastata numeroin 1, 2, 3 tai 4!");
        System.out.println("* Jos syötät numeron vastausvaihtoehtojen ulkopuolelta tai merkkijonon, tulee sama kysymys vastattavaksi uudestaan.");
        System.out.println("* Jokaisesta oikeasta vastauksesta kasvatat pistesaldoasi yhdellä! Vääristä vastauksista ei sakoiteta.");
        System.out.println("* Onnea peliin! :)");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
    }


}


