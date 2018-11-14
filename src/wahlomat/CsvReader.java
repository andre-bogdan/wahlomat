package wahlomat;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class CsvReader{

public static void reader(String[] args) throws FileNotFoundException {

    Scanner s = new Scanner(new File("wahlomat.csv"));
    ArrayList<String> listS = new ArrayList<String>();
    
    while (s.hasNextLine()){
    listS.add(s.nextLine());
    }

}
    
    
    
}


