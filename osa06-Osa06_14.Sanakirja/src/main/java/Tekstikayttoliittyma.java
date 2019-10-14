/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja){
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    public void kaynnista() {
        System.out.println("Komennot");
        System.out.println("\t lisaa - lisää sanaparin sanakirjaan");
        System.out.println("\t kaanna - kysyy sanan ja tulostaa sen käännöksen");
        System.out.println("\t lopeta - poistuu käyttöliittymästä");
        while (true) {
            System.out.println("");
            System.out.print("Komento: ");
            String komento = this.lukija.nextLine();

            if (komento.toLowerCase().equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            } else if (komento.toLowerCase().equals("lisaa")){
                System.out.print("Suomeksi: ");
                String sana = lukija.nextLine();
                System.out.print("Käännos: ");
                String kaannos = lukija.nextLine();
                sanakirja.lisaa(sana, kaannos);
                System.out.println("");
            }else if (komento.toLowerCase().equals("kaanna")) {
                System.out.print("Anna sana: ");
                String sana = lukija.nextLine();
                System.out.print("Käännös: " + sanakirja.kaanna(sana));
                System.out.println("");
            }else {
                System.out.println("Tuntematon komento.");
            }
        }

    }

}

