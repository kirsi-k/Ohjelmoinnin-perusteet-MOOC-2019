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

public class Lintutietokanta {
    private ArrayList<Lintu> linnut;
    
    public Lintutietokanta(){
        this.linnut = new ArrayList<>();
    }
    public void lisaa(String nimi, String latinaNimi){
        linnut.add(new Lintu(nimi, latinaNimi, 0));
    }
    public void lisaaHavainto(String nimi) {
        boolean loytyi = false;
        for (Lintu lintu : linnut) {
            if (lintu.getNimi().contains(nimi)) {
                lintu.setHavainnot(lintu.getHavainnot() + 1);
                loytyi = true;
            }
        }
        if (!loytyi) {
            System.out.println("Ei ole lintu!");
        }
    }
    public void naytaTilasto() {
        for (Lintu lintu : linnut) {
            System.out.println(lintu);
        }
    }
    public void naytaLintu(String nimi){
        boolean loytyi = false;
        for (Lintu lintu: linnut){
            if (lintu.getNimi().contains(nimi)){
                System.out.println(lintu);
                loytyi = true;
            }
        if (!loytyi){
            System.out.println("Lintua ei löytynyt tietokannasta");
        }
      }
    }
}
