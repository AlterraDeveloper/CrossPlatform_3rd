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
  List < Integer > byteArray = new ArrayList < Integer > ();
  int nextByte = -1;
  try {
   FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
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

  show("seventh");
  byteArray.clear();
  try {
   RandomAccessFile randomAccessFile = new RandomAccessFile("input.txt", "r");
   try {
    randomAccessFile.seek(20);
    nextByte = -1;
    while (true) {
     nextByte = randomAccessFile.read();
     if (nextByte == -1) break;
     else byteArray.add(nextByte);
    }
    for (int ch: byteArray)
     System.out.print((char) ch);
   } catch (IOException ex) {}
  } catch (FileNotFoundException ex) {}
  getch();

  show("eighth");
  try {
   java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile("arc.zip");
   for (Enumeration < java.util.zip.ZipEntry > e = (Enumeration < java.util.zip.ZipEntry > ) zipFile.entries(); e.hasMoreElements();) {
    java.util.zip.ZipEntry tmp = e.nextElement();
    if (!tmp.isDirectory())
     System.out.println(tmp.getName() + "  Size: " + tmp.getSize() + " bytes  Compressed size: " + tmp.getCompressedSize() + " bytes");
   }
  } catch (IOException ioex) {
   ioex.printStackTrace();
  }
  getch();


  show("ninth");
  try {
   File currentDir = new File("/home/altersoft/alterra/3_rd/CrossPlatform_3rd/pract5");
   java.util.zip.ZipOutputStream zipOutputStream =
    new java.util.zip.ZipOutputStream(new FileOutputStream(new File("new.zip")));
   for (String file: currentDir.list()) {
    if (file.contains("zip")) continue;
    else {
     java.util.zip.ZipEntry tmp = new java.util.zip.ZipEntry(file);
     zipOutputStream.putNextEntry(tmp);
     zipOutputStream.closeEntry();
    }
   }
   zipOutputStream.close();
   System.out.println("Successfully created archive new.zip");
  } catch (IOException ioex) {
   ioex.printStackTrace();
  }
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