import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CSVReader {
	
	
	
	static String[][] data = new String[628408][14];
//	static HashMap<String , ComplaintDetails> data = new HashMap<>();
	public static void fun() {
//		Arrays.fill(data, "0");
		String filepath = "src\\complaints.csv";
        BufferedReader reader = null;
        String line = "";
		try {
        	reader = new BufferedReader(new FileReader(filepath));
        	int i = 0;
        	while((line = reader.readLine()) != null ) {
        	  String[] row  = line.split(",");
        		data[i][0] = row[0];
        		data[i][1] = row[1];
        		data[i][2] = row[2];
        		data[i][3] = row[3];
        		data[i][4] = row[4];
        		data[i][5] = row[5];
        		data[i][6] = row[6];
        		data[i][7] = row[7];
        		data[i][8] = row[8];
        		data[i][9] = row[9];
        		data[i][10] = row[10];
        		data[i][11] = row[11];
        		data[i][12] = row[12];
        		data[i][13] = row[13];       
                i++;
        }
        	System.out.println(i);
        	System.out.println("file loaded in array");
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
		finally {
			try {
				reader.close();
			} catch (IOException e) 
			  {
				e.printStackTrace();
			  }
		}
		     
	}
}
