import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;

class Server{
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket client = null;

        BufferedReader inbound = null;
        OutputStream outbound = null;
        try
          {
          // Create a server socket
          serverSocket = new ServerSocket(2020);

          System.out.println("Waiting for requests...");

          while (true)
        {
          // Wait for a  request
              client = serverSocket.accept();

              // Get the streams
          inbound=new BufferedReader(new
                  InputStreamReader(client.getInputStream()));
              outbound = client.getOutputStream();

              //Get request
              String request = inbound.readLine();

              //Generate response message - current date and time
              String response;
              if("Time".equalsIgnoreCase(request)){
                  response = new SimpleDateFormat("EEE dd MMMM yyyy HH:mm:ss\n").format(new Date());
              }else response = "Bad request\n";

              System.out.println("Connected to host : " + client.toString());
              //Send response to client
               outbound.write(response.getBytes());
               outbound.write("End\n".getBytes());

          }
    } catch (IOException ioe) {
  	System.out.println("Error in Server: " + ioe);
    }  finally{
        try{
            inbound.close();
            outbound.close();
          }catch(Exception e){
         	 System.out.println("StockQuoteServer: can't close streams" + e.getMessage());
          }
      }
}
}
