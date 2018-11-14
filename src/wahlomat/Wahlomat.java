package wahlomat;
class Staat{
    public String name;
    public int einwohnerzahl, demo,rep,winner;

    public Staat(String name, int einwohnerzahl) {
        this.name = name;
        this.einwohnerzahl = einwohnerzahl;
    }

    public void setDemo(int demo) {
        this.demo = demo;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    
}

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

        einwohner = new Staaten().ArrayEinwohner();

        //Sieger Array initialisieren
        Staat[] objectArray = new Staat[staaten.length];
        for(int i=0;i<staaten.length;i++){
            objectArray[i] = new Staat(staaten[i],einwohner[i]);
        }
        //Funktion SiegerErmitteln aufrufen
        //Wenn Sieger <> Republikaner -> Funktion SiegerErmitteln aufrufen
        //Ergebnis ausgeben
        //fertig
    }

}
