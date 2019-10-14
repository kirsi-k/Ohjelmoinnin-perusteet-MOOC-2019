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
import java.util.Collections;

public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> kaannokset;
    
    public UseanKaannoksenSanakirja(){
        this.kaannokset = new HashMap<>();
    }
    public void lisaa(String sana, String kaannos){
        this.kaannokset.putIfAbsent(sana, new ArrayList<>());
        ArrayList<String> useakieli = this.kaannokset.get(sana);
        useakieli.add(kaannos);
    }
    public ArrayList<String> kaanna(String sana){
        return kaannokset.getOrDefault(sana, new ArrayList<>());
    }
    public void poista(String sana){
        kaannokset.remove(sana);
    }
}
