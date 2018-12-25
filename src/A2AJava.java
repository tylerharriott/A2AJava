import com.cloakware.cspm.client.CSPMClient;

public class A2AJava {

    public static void main(String[] args) {
        A2AJava exampleHost = new A2AJava();    // Declare a sample host to work with
        exampleHost.getA2AInfo();    // Call to getA2AInfo method
    }


    public void getA2AInfo(){
        String[] values = {"alias_name"};   // Enter alias name of host

        try {
            if(values.length != 1) {
                System.out.println("Missing CLI arguments");
                System.exit(256);
            }

            String targetAlias = values[0];     //Initialize

            System.out.println("Host Alias:  "+ targetAlias);
            CSPMClient cspmClient = new CSPMClient();

            if(values.length == 1) {

                cspmClient.retrieveCredentials(targetAlias, true);
                cspmClient.getAllCredentials();

            }

            // Capture results
            String statusCode = cspmClient.getStatusCode();
            String userId = cspmClient.getUserId();
            String password = cspmClient.getPassword();
            String xmlData = cspmClient.getXMLData();

            // Print out the results
            System.out.println("Status Code: " + statusCode);
            System.out.println("UsedId: " + userId);
            System.out.println("Password: " + password);
            System.out.println("XML Data: " + xmlData);


            if (statusCode.equals("400")) {
                System.out.println("PASSED");   // If statusCode is 400, print success

            } else {
                System.out.println("FAILED");   // If statusCode is not 400, print failed.

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(100);
        }


    }
}


