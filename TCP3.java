import java.io.*;
import java.net.*;

class TCP3
{
    public static void main(String argv[]) throws Exception
    {
        String clientMessage;
        ServerSocket messageSocket = new ServerSocket(6789);
        while(true) {
            Socket connectionSocket = messageSocket.accept();
            BufferedReader bd = new BufferedReader(new InputStreamReader
            (connectionSocket.getInputStream()));
            clientMessage = bd.readLine();
            System.out.println("Melding mottat fra klient: " + clientMessage);
        }
    }
}
