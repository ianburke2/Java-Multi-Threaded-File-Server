package client;

// Model class for the configuration settings
public class ClientConfig {
	
    private String username;
    private String serverHost;
    private int serverPort;
    private String downloadDir;

    //Constructor
    public ClientConfig() {
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getServerHost() {
        return serverHost;
    }

    public int getServerPort() {
        return serverPort;
    }

    public String getDownloadDir() {
        return downloadDir;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public void setDownloadDir(String downloadDir) {
        this.downloadDir = downloadDir;
    }

    @Override
    public String toString() {
        return "ClientConfig {" +
               "username='" + username + '\'' +
               ", serverHost='" + serverHost + '\'' +
               ", serverPort=" + serverPort +
               ", downloadDir='" + downloadDir + '\'' +
               '}';
    }
}
