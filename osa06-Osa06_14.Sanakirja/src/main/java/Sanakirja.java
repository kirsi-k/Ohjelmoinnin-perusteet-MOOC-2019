/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Sanakirja {
    private HashMap<String, String> sanakirja; 
    
    
    public Sanakirja (){
        this.sanakirja = new HashMap<>();
        
    }
    public void lisaa(String sana, String kaannos) {
       this.sanakirja.putIfAbsent(sana, kaannos);
       
    }
    public String kaanna(String sana){
        return sanakirja.getOrDefault(sana, null);
    }
    public int sanojenLukumaara(){
        return sanakirja.size();
    }
    public ArrayList<String> kaannoksetListana(){
        ArrayList<String> sanalista = new ArrayList<>();
        for (String avain: this.sanakirja.keySet()){
            sanalista.add(avain + " = " + sanakirja.get(avain));
        }
        return sanalista;
    }
} 


