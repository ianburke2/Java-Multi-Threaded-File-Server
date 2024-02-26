package client;

import java.util.Scanner;

public class ClientUI {
	
	

	  public void start() {
		  
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        while (true) {
	            System.out.println("\n*** File Client Menu ***");
	            System.out.println("1. Connect to Server");
	            System.out.println("2. List Files");
	            System.out.println("3. Download File");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    //fileClient.connectToServer();
	                    break;
	                case 2:
	                    //fileClient.listFiles();
	                    break;
	                case 3:
	                    System.out.print("Enter file name to download: ");
	                    String fileName = scanner.nextLine();
	                    //fileClient.downloadFile(fileName);
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    return; //Break out of the while loop and end the finish the method
	                    //Could use System.exit(0); to terminate the program.
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	            }//Switch end
	          }//While end
	  }//Start() end
}//class end