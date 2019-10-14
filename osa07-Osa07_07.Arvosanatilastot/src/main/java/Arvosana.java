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

public class Arvosana {
    private ArrayList<Integer> pisteet;
    private int [] arvosanat;
    private ArrayList<Integer> hyvaksytyt;
    private int summa;
    private int hyvaksyttyjenMaara;
    private int hyvaksyttyjenSumma;
  
    public Arvosana(){
        this.pisteet = new ArrayList<>();
        this.arvosanat = new int[6];
        this.hyvaksytyt = new ArrayList<>();
        this.summa = 0;
        this.hyvaksyttyjenMaara = 0;
        this.hyvaksyttyjenSumma = 0;
    }
    public void lisaaPisteet (int pistemaara){
        pisteet.add(pistemaara);
        this.summa = this.summa + pistemaara;
        if (pistemaara >= 50){
            hyvaksytyt.add(pistemaara);
            this.hyvaksyttyjenSumma = this.hyvaksyttyjenSumma + pistemaara;
        }
    }
    public double keskiarvo(){
        double keskiarvo = 1.0 * this.summa / pisteet.size();
        return keskiarvo;
    }
    public double hyvaksyttyjenKeskiarvo(){
        double hyvaksyttyjenKeskiarvo = this.hyvaksyttyjenSumma / hyvaksytyt.size();
        return hyvaksyttyjenKeskiarvo;
    }
    public void getArvosanat() {
        for (int pistemaara : pisteet) {
            if (pistemaara < 50) {
                arvosanat[0]++;
            } else if (pistemaara < 60) {
                arvosanat[1]++;
                hyvaksyttyjenMaara++;
            } else if (pistemaara < 70) {
                arvosanat[2]++;
                hyvaksyttyjenMaara++;
            } else if (pistemaara < 80) {
                arvosanat[3]++;
                hyvaksyttyjenMaara++;
            } else if (pistemaara < 90) {
                arvosanat[4]++;
                hyvaksyttyjenMaara++;
            } else if (pistemaara >= 90) {
                arvosanat[5]++;
                hyvaksyttyjenMaara++;
            }
        }
    }
    public double hyvaksymisProsentti() {
        if (pisteet.size() > 0) {
            return 100.0 * hyvaksyttyjenMaara / pisteet.size();
        }
        return 0;
    }    
    public void tulostaArvosanajakauma(){
        System.out.println("Arvosanajakauma:");
        for (int arvosana = 5; arvosana >= 0; arvosana--) {
            System.out.print(arvosana + ": ");
            tulostaTahtia(arvosanat[arvosana]);
            System.out.println();
        }
    }
    public static void tulostaTahtia(int maara){
        int i = 0;
        while (i < maara){
            System.out.print("*");
            i++;
        }
    }
} 
