/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wahlomat;

import java.util.Random;

/**
 *
 * @author cwegner
 */
public class Wahlomat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Array einlesen
        
        //Sieger Array initialisieren
        
        //Funktion SiegerErmitteln aufrufen
        
        //Wenn Sieger <> Republikaner -> Funktion SiegerErmitteln aufrufen
        
        //Ergebnis ausgeben
        
        	Random wuerfel = new Random();
		int augenZahl;

		for (int i=0; i<10; i++){
			augenZahl = 1 + wuerfel.nextInt(6);
			System.out.println(augenZahl);
        
    }
    
}
}