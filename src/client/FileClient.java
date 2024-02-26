package client;

import java.util.Scanner;

public class FileClient {
	
    private ClientConfig config; // Configuration details for the client
    private boolean isConnected = false; // Tracks connection status to the server
    private String xmlfilepath = "src/client-config.xml";

    public static void main(String[] args) {
    	
        FileClient client = new FileClient();
        client.loadConfig(); // Load configuration from XML file
        client.showMenu(); // Display the interactive menu
    }

    // Loads configuration settings from an XML file using the ConfigParser
    private void loadConfig() {
        ConfigParser parser = new ConfigParser();
        config = parser.parseConfig(xmlfilepath);
        System.out.println(config.toString()+"\n");
    }

    // Displays a menu to the user and handles user input to perform actions
    private void showMenu() {
        Scanner scanner = new Scanner(System.in); // Scanner for reading user input
        int option; // User's menu choice
        do {
            // Display menu options
            System.out.println("1. Connect to Server");
            System.out.println("2. Print File Listing");
            System.out.println("3. Download File");
            System.out.println("4. Quit");
            System.out.print("Type Option [1-4]> ");

            option = scanner.nextInt(); // Read user's choice
            switch (option) {
                case 1:
                    connectToServer(); // Connect to the server
                    break;
                case 2:
                    printFileListing(); // Print the list of files available on the server
                    break;
                case 3:
                    downloadFile(scanner); // Download a file from the server
                    break;
                case 4:
                    System.out.println("Exiting..."); // Exit the program
                    break;
                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 4.");
            }
        } while (option != 4); // Repeat until the user chooses to quit
    }

    // Attempts to connect to the server using configuration settings
    private void connectToServer() {
        // Placeholder for connection logic
        System.out.println("Connecting to server at " + config.getServerHost() + ":" + config.getServerPort());
        isConnected = true; // Assume connection is successful for demonstration purposes
    }

    // Placeholder method to simulate printing file listing from the server
    private void printFileListing() {
        if (!isConnected) {
            System.out.println("Please connect to the server first.");
            return;
        }
        // Placeholder for logic to query and print file listing from the server
        System.out.println("Printing file listing...");
    }

    // Simulates downloading a file from the server based on user input
    private void downloadFile(Scanner scanner) {
        if (!isConnected) {
            System.out.println("Please connect to the server first.");
            return;
        }
        System.out.print("Enter the file name to download: "); // Prompt user for file name
        String fileName = scanner.next(); // Read file name from user input
        // Placeholder for file download logic
        System.out.println("Downloading file: " + fileName); // Simulate file download
    }
}
