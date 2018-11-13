<<<<<<< HEAD
package wahlomat;

import java.lang.Object;
import ;

public class csv_Import {

pString[] row = null;
String csvFilename = "C:\\work\\sample.csv";

CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
List content = csvReader.readAll();

for (Object object : content) {
	row = (String[]) object;
	
	System.out.println(row[0]
	           + " # " + row[1]
	           + " #  " + row[2]);
}

//Daniel test


}
=======

package wahlomat;

import java.lang.Object;
import ;

public class csv_Import {

pString[] row = null;
String csvFilename = "C:\\work\\sample.csv";

CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
List content = csvReader.readAll();

for (Object object : content) {
	row = (String[]) object;
	
	System.out.println(row[0]
	           + " # " + row[1]
	           + " #  " + row[2]);
}
//...

csvReader.close();


}
>>>>>>> 102b13b15a8a5eb1c8a478ba68e94fabd8255b91
