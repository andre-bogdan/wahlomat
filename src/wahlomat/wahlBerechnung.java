package wahlomat;

import java.io.BufferedReader;

public class wahlBerechnung {

    //Variablen:
    //Constuctors:
    //Methoden:  
    public void readCSV() {
 
        
    }

    public void ArrayInit() {

    }

    public void SiegerErmitteln() {
        Random wuerfel = new Random();
        int augenZahl;

        for (int i = 0; i < 10; i++) {
            augenZahl = 1 + wuerfel.nextInt(6);
        }
    }

    public void ErgebnisAusgeben() {

        System.out.println(augenZahl);
    }

}
