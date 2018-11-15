package wahlomat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

class Staat{
    public String name;
    public int einwohnerzahl, demo,rep,winner;

    public Staat(String name, int einwohnerzahl) {
        this.name = name;
        this.einwohnerzahl = einwohnerzahl;
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
        
        //Sieger ermiteln/erfaken
        int putin = 0;
        int zahl_demo;
        int demo = 0;
        int rep = 0;
        int durchlauf = 0;
        String winner = null;
        do{
            demo = 0;
            rep = 0;
            for(int i=0;i<staaten.length;i++){
                Random stimmen = new Random();
                zahl_demo = 0;
                zahl_demo = 1 + stimmen.nextInt(objectArray[i].einwohnerzahl);
                objectArray[i].demo = zahl_demo;
                objectArray[i].rep = objectArray[i].einwohnerzahl-zahl_demo;
                if(objectArray[i].demo>objectArray[i].rep){
                    objectArray[i].winner = 0;
                }else{
                    objectArray[i].winner = 1;
                }
            }
            
            for(int i=0;i<staaten.length;i++){
                if(objectArray[i].winner==0){
                    demo=demo+1;
                }else{
                    rep=rep+1;
                }
            }
            if(demo>=rep){
                putin = 0;
                durchlauf = durchlauf +1;
                winner = "Demokraten";
            }else{
                putin = 1;
                winner = "Repuplikaner";
            }
            
        }while(putin==0);
        
        //Ergebnis ausgeben
        PrintWriter pWriter = null; 
        try { 
            pWriter = new PrintWriter(new BufferedWriter(new FileWriter("FakeNews.txt"))); 
            for(int i=0;i<staaten.length;i++){
                pWriter.println("Staat = " + objectArray[i].name);
                pWriter.println("Einwohner = " + objectArray[i].einwohnerzahl);
                pWriter.println("Demokraten = " + objectArray[i].demo);
                pWriter.println("Repuplikaner = " + objectArray[i].rep);
                pWriter.println("Gewonnen = " + objectArray[i].winner);
                pWriter.println("____________________________________");
            }
            pWriter.println("Tata gewonnen haben man ahnt es kaum die " + winner + "\n\r" + demo + " Gouverneure für die Demokraten\n\r" + rep + " Gouverneure für die Repuplikaner");   
        } catch (IOException ioe) { 
            ioe.printStackTrace(); 
        } finally { 
            if (pWriter != null){ 
                pWriter.flush(); 
                pWriter.close(); 
            } 
        } 
        for(int i=0;i<staaten.length;i++){
            System.out.println("Staat = " + objectArray[i].name);
            System.out.println("Einwohner = " + objectArray[i].einwohnerzahl);
            System.out.println("Demokraten = " + objectArray[i].demo);
            System.out.println("Repuplikaner = " + objectArray[i].rep);
            System.out.println("Gewonnen = " + objectArray[i].winner);
            System.out.println("____________________________________");
        }
        System.out.println("Putin hat " + durchlauf + " mal zugeschlagen.");
        System.out.println("Tata gewonnen haben man ahnt es kaum die " + winner + "\n\r" + demo + " Gouverneure für die Demokraten\n\r" + rep + " Gouverneure für die Repuplikaner");
    }

}
