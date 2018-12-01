import java.io.*;
import java.util.Date;

public class WorkWithFiles {

 public static void main(String[] args) {


  show("first");
  try {
   File file = new File("Test.txt");
   file.createNewFile();
   File tmpFile = File.createTempFile("test", null, new File("."));
   System.out.println("Successfully created files : " + file.getName() + " , " + tmpFile.getName());
  } catch (IOException ioex) {
   ioex.printStackTrace();
  }
  getch();

  show("second");
  try {
   File file = new File("myfile.txt");
   file.createNewFile();
   System.out.println("Wait...7 seconds...");
   try {
    java.util.concurrent.TimeUnit.SECONDS.sleep(7);
   } catch (InterruptedException iex) {
    iex.printStackTrace();
   }
   if (file.renameTo(new File("yourfile.txt")))
    System.out.println("Successfully renamed file myfile.txt to yourfile.txt");
   else System.out.println("Renaming failed");
   file = new File("folder");
   file.mkdir();
   if (file.renameTo(new File("folder-123")))
    System.out.println("Successfully renamed directory folder to folder-123");
   else System.out.println("Renaming failed");
  } catch (IOException ioex) {
   ioex.printStackTrace();
  }
  getch();

  show("third");
  File file = new File(".");
  for (String str: file.list()) {
   if (str.contains("txt") || str.contains("tmp") || new File(str).isDirectory()) {
    if (new File(str).delete())
     System.out.println("Successfully deleted : " + str);
   }
  }
  getch();

  show("fourth");
  file = new File("qwerty.txt");
  try {
   file.createNewFile();
  } catch (IOException ioex) {
   ioex.printStackTrace();
  }
  if (file.setReadOnly())
   System.out.println("Successfully make file qwerty.txt readonly");
  getch();

  show("fifth");
  file = new File("qwerty.txt");
  file.setLastModified(new Date(1998 - 1900, 10, 24).getTime());
  System.out.println("Successfully change last modified time \"qwerty.txt\"");
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