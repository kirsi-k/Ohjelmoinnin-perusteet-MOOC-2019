/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Elokuva {
    private String nimi;
    private int ika;
    
        public Elokuva (String elokuvanNimi, int elokuvanIkaraja) {
            this.nimi = elokuvanNimi;
            this.ika = elokuvanIkaraja;
        }
        public String nimi() {
            return nimi;
        }
        public int ikaraja() {
            return ika;
        }
}
