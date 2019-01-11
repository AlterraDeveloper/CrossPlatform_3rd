import java.io.*;
import java.net.*;
import java.util.*;

class Client{
    public static void main(String[] args) {
        OutputStream outbound = null;
        BufferedReader inbound = null;
        Socket clientSocket = null;

        try{
            while(true){
            clientSocket = new Socket("localhost",2020);
            System.out.println("Client : " + clientSocket);

            outbound = clientSocket.getOutputStream();
            inbound = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String request = "";
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try{
                    request = reader.readLine();
                }catch(IOException ioe){}

                    outbound.write((request + "\n").getBytes());
                    outbound.write("End\n".getBytes());

                String response = "";
                while (true){
            		   response = inbound.readLine();
            	       if ("End".equals(response)){
                            break;
                         }
                         System.out.println(response);
                     }

            }


        }catch(IOException ioex){
            System.out.println("IOException has occured");
        }finally{
            try{
       	     outbound.close();
       	     inbound.close();
       	     clientSocket.close();
       	 } catch(IOException e){
       	      System.out.println("IOException has occured");
       	 }catch(NullPointerException ex){
             System.out.println("NullPointerException has occured");
         }
        }
    }
}
