package client;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ConfigParser {

    // Parses the configuration from an XML file and returns a ClientConfig object
    public ClientConfig parseConfig(String filePath) {
    	
        ClientConfig config = new ClientConfig();
        try {
            // Instantiate a factory for creating DocumentBuilder instances
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            // Create a new instance of a DocumentBuilder using the factory
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            // Parse the XML file at the given filePath into a Document object
            Document doc = dBuilder.parse(filePath);
            // Normalize the document to combine adjacent text nodes and remove empty ones
            doc.getDocumentElement().normalize();

            // Retrieve the root element from the document
            Element root = doc.getDocumentElement();

            // Extract values from the XML and set them on the ClientConfig instance
            config.setUsername(root.getAttribute("username"));
            config.setServerHost(getTagValue("server-host", root));
            config.setServerPort(Integer.parseInt(getTagValue("server-port", root)));
            config.setDownloadDir(getTagValue("download-dir", root));

        } catch (Exception e) {
            // Print the stack trace of any exceptions caught during parsing
            e.printStackTrace();
        }
        // Return the populated ClientConfig object
        return config;
    }

    // Helper method to extract the text content of a given tag from an element
    private String getTagValue(String tag, Element element) {
        // Retrieve a NodeList of all elements under 'element' that match the given tag
        // Select the first item in the list and get its child nodes
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        // Select the first node (which should be the text node) from the child nodes
        Node node = (Node) nodeList.item(0);
        // Return the text content of the node
        return node.getNodeValue();
    }
}
