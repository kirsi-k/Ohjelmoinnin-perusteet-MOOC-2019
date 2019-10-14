/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
 
import java.util.ArrayList;

public class Kirjasto {

    private ArrayList<Kirja> kirjasto;

    public Kirjasto() {
        kirjasto = new ArrayList<>();
    }

    public void lisaaKirja(Kirja uusiKirja) {
        kirjasto.add(uusiKirja);
    }

    public void tulostaKirjat() {
        if (!kirjasto.isEmpty()) {
            for (Kirja kirja : this.kirjasto) {
                System.out.println(kirja);
            }
        }
    }

    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : this.kirjasto) {
            if (StringUtils.sisaltaa(kirja.nimeke(), nimeke)) {
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : this.kirjasto) {
            if (StringUtils.sisaltaa(kirja.julkaisija(), julkaisija)) {
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : this.kirjasto) {
            if (kirja.julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }
}
