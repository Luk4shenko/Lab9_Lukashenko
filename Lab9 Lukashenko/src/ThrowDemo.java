import java.util.Scanner;
public class ThrowDemo {
    public void getKey()
    {
        while(true) {
            try {
                Scanner myScanner = new Scanner(System.in);
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                if (key.length()>10)
                    throw new Exception("Too long key");
                printDetails(key);
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}