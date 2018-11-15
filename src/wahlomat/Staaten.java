package wahlomat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Staaten {
    public String[] ArrayStaaten() {
         
        String csvFile = "wahlomat.csv";
        String line = "";
        String cvsSplitBy = ";";
        
        String[] erg = new String[52];
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int i = 0;
            while ((line = br.readLine()) != null) {
                
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                erg[i] = country[0];
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        return erg;
    }

    public int[] ArrayEinwohner() {
        
        String csvFile = "wahlomat.csv";
        String line = "";
        String cvsSplitBy = ";";
        int[] erg = new int[52];
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int i = 0;
            while ((line = br.readLine()) != null) {
                
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                
                erg[i] = Integer.parseInt(country[1]);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return erg;
    }
}
