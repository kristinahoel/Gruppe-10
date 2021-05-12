import java.net.*;
import java.io.*;

<<<<<<< HEAD
public class DateServer
 {
   public static void main(String[] args) {
        try {
              ServerSocket sock = new ServerSocket(6017);

              /* now listen for connections */
              while (true) {
                Socket client = sock.accept();

                PrintWriter pout = new
                 PrintWriter(client.getOutputStream(), true);
                  String quoteOfDay = "IS105 er rimelig interessant";

                pout.println(quoteOfDay.toString());
                /* close the socket and resume */
                /* listening for connections */
                client.close();
               }
             }
             catch (IOException ioe) {
                System.err.println(ioe);
              }
            }
          }








=======
public class DateServer {
    public static void main(String[] args) {
        try {
            ServerSocket sock = new ServerSocket(6017);
            String line;
            while (true) {
                Socket client = sock.accept();

                PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
                InputStream is = client.getInputStream();
                BufferedReader cin = new BufferedReader(new InputStreamReader(is));

                while ((line = cin.readLine()) != null) {
                    pout.println("server:" + line);
                    pout.flush();
                    System.out.println(line);
                }
                client.close();
            }
        }
        catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}
>>>>>>> 9d4a5b1c7f3f05bd40988939617d1d1eef3eb1e2
