package wahlomat;

public class Wahlomat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Array einlesen     
        String[] staaten;
        int[] einwohner;

        staaten = new Staaten().ArrayStaaten();
        System.out.println(staaten[8]);

        einwohner = new Staaten().ArrayEinwohner();

        //Sieger Array initialisieren
        //Funktion SiegerErmitteln aufrufen
        //Wenn Sieger <> Republikaner -> Funktion SiegerErmitteln aufrufen
        //Ergebnis ausgeben
        //fertig
    }

}
