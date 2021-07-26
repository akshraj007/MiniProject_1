import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.text.ParseException;

public class ComplaintDetails {
	static int yearToSearch = UserInteraction.year;
	static String nameToSearch = UserInteraction.name;
	static int complaintIDToSearch = UserInteraction.compID;
   static void checkDate() {
	   for(int i = 0 ; i < CSVReader.data.length ; i++) {
		   if(i > 0) {
		   int y = Integer.parseInt(CSVReader.data[i][0].substring(6, 10));
		   if(y == yearToSearch) {
    		   for(int j = 0 ; j < 14 ; j++) {
    			   System.out.printf(CSVReader.data[i][j] + " ");
    		     }
    		       System.out.println();
    		    }
    	     }
	      }
	   }
      
     static void checkNameOfBank() {
    	 for(int i = 0 ; i < CSVReader.data.length ; i++) {
  		   if(i > 0) {
  		   String name = CSVReader.data[i][5];
  		   if(name.equalsIgnoreCase(nameToSearch)){
      		   for(int j = 0 ; j < 14 ; j++) {
      			   System.out.printf(CSVReader.data[i][j] + " ");
      		     }
      		       System.out.println();
      		    }
      	     }
  	      }
     }
     
     static void checkComplaintID() {
    	 for(int i = 0 ; i < CSVReader.data.length ; i++) {
    		   if(i > 0) {
    			int complaintID = Integer.parseInt(CSVReader.data[i][13]);
    		   if(complaintID == complaintIDToSearch){
        		   for(int j = 0 ; j < 14 ; j++) {
        			   System.out.printf(CSVReader.data[i][j] + " ");
        		     }
        		       System.out.println();
        		    }
        	     }
    	      }
       }
      
     static void NumberOfDays() {
    	 for(int i = 0 ; i < CSVReader.data.length ; i++) {
  		   if(i > 0) {
  			 SimpleDateFormat obj1=new SimpleDateFormat("dd MM yyyy");
				try
				{
					Date date1=obj1.parse(CSVReader.data[i][0]);
					Date date2=obj1.parse(CSVReader.data[i][9]);
					long time_difference=date2.getTime()-date1.getTime();
					long days_difference=TimeUnit.MILLISECONDS.toDays(time_difference)%365;
					System.out.println(days_difference);
				}
				catch(ParseException e)
				{
				    e.printStackTrace();
				}
      		    
      	     }
  	      }
     }
     
     static void checkClosed() {
    	 for(int i = 0 ; i < CSVReader.data.length ; i++) {
  		   if(i > 0) {
  		   String c1 = "Closed";
  		   String c2 = "Closed with explanation";
  		   if(CSVReader.data[i][10].equalsIgnoreCase(c1) ||
  			   CSVReader.data[i][10].equalsIgnoreCase(c2)){
      		   for(int j = 0 ; j < 14 ; j++) {
      			   System.out.printf(CSVReader.data[i][j] + " ");
      		     }
      		       System.out.println();
      		    }
      	     }
  	      }
     }
     static void checkResponse() {
    	 for(int i = 0 ; i < CSVReader.data.length ; i++) {
    		   if(i > 0) {
    		   String resp = "Yes";
    		   if(CSVReader.data[i][11].equalsIgnoreCase(resp)){
        		   for(int j = 0 ; j < 14 ; j++) {
        			   System.out.printf(CSVReader.data[i][j] + " ");
        		     }
        		       System.out.println();
        		    }
        	     }
    	      }
     }
	
   }
