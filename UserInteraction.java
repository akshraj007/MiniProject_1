import java.util.Scanner;

public class UserInteraction {
    static int year;
    static int choice;
    static String name;
    static int compID;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSVReader.fun();
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1 for Displaying all"
	       	+ " the complaints based on the year provided "
	       	+ "by the user");
       System.out.println("Enter 2 for Displaying all "
       		+ "the complaints "
       		+ "basedon the name of the bank "
       		+ "provided by the user");
       System.out.println("Enter 3 for Displaying complaints "
       		+ "based on the complaint id "
       		+ "provided by the user");
       System.out.println("Enter 4 for Displaying number of days "
       		+ "took by the Bank to close"
       		+ " the complaint");
       System.out.println("Enter 5 for Displaying all the complaints"
       		+ " closed/closed "
       		+ "with explanation");
       System.out.println("Enter 6 for Displaying all the "
       		+ "complaints which "
       		+ "received a timely response");
       
       choice = scan.nextInt();
       switch(choice) {
       case 1 : 
    	      System.out.println("Enter the Year");
    	      year = sc.nextInt();
    	      ComplaintDetails.checkDate();
              break;
       case 2 : 
    	      System.out.println("Enter the Name");
    	      name = sc.nextLine();
    	      ComplaintDetails.checkNameOfBank();
    	      break;
       case 3 : 
    	   System.out.println("Enter the Customer ID");
 	       compID = sc.nextInt();
 	      ComplaintDetails.checkComplaintID();
 	       break;
       case 4 :
    	   ComplaintDetails.NumberOfDays();
 	       break;
       case 5 : 
    	   ComplaintDetails.checkClosed();
 	       break;
       case 6 : 
    	   CSVReader.fun();
 	       break;
       }
	}

}
