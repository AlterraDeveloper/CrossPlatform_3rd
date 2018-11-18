import java.io.*;
import java.util.*;

public class MyIO {

 public static void main(String[] args) {

  show("first");
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String string = "";
  StringBuffer strBfr = new StringBuffer();
  System.out.println("Type smth here, for exit input type \"exit\" : ");
  do {
   try {
    string = reader.readLine();
   } catch (IOException ioe) {}
   strBfr.append(string + "\n");
  } while (!string.equals("exit"));
  System.out.println("History of input : \n" + strBfr);
  getch();

  show("second");
  float hits = 10, a = 3;
  string = String.format("%.3f", hits / a);
  System.out.println("Formatting 10/3 with String.format : " + string);
  System.out.println("Formatting 10/3 with Formatter.format : " + new Formatter().format("%1$.3f", hits / a));
  getch();

  show("third");
  Calendar calendar = new GregorianCalendar();
  System.out.format("Current date and time : %1$tH:%1$tM:%1$tS ,%1$tA %1$te %1$tB %1$tY", calendar);
  getch();

  show("fourth");
  calendar = new GregorianCalendar(1998, 10, 24);
  System.out.println("My birthday : " + String.format("%tB %te, %tY", calendar, calendar, calendar));
  getch();

  show("fifth");
  try {
   reader = new BufferedReader(new FileReader("input.txt"));
   PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
   while (true) {
    string = reader.readLine();
    if (string != null) {
     writer.println(string);
     writer.flush();
    } else break;
   }
   System.out.println("Contents of file input.txt successfully copied to output.txt!");
  } catch (IOException ioe) {}
  getch();

  show("sixth");
  try {
   FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
   ArrayList byteArray = new ArrayList();
   int nextByte = -1;
   while (true) {
    try {
     nextByte = fileInputStream.read();
    } catch (IOException ioe) {}
    if (nextByte == -1) break;
    else byteArray.add(nextByte);
   }
   System.out.println(byteArray);
   System.out.println("Length of array : " + byteArray.size());
  } catch (FileNotFoundException ex) {}
  getch();

 }

 static void show(String s) {
  System.out.println("---------------------------");
  System.out.println("task " + s);
  System.out.println("---------------------------");
 }

 static void getch() {
  try {
   System.in.read();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

}