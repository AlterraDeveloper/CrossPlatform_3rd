import java.io.*;
import java.util.Date;
import java.util.ArrayList;

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
   System.out.println("Wait...5 seconds...");
   try {
    java.util.concurrent.TimeUnit.SECONDS.sleep(5);
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

  show("sixth");
  file = new File("WorkWithFiles.java");
  System.out.println("Size of " + file.getName() + " : " + file.length() + " bytes");
  getch();

  show("seventh");
  file = new File("qwerty.txt");
  System.out.println(file.getName() + " exists ? " +
   (file.exists() == true ? "Yes" : "No"));
  getch();

  String workDirOnLinux = "/home/altersoft/alterra/3_rd/CrossPlatform_3rd";
  show("eighth");
  file = new File("qwerty.txt");
  file.renameTo(new File(workDirOnLinux + "/qwerty.txt"));
  File file2 = new File(workDirOnLinux + "/qwerty.txt");
  if (file2.exists())
   System.out.println("Successfully moved qwerty.txt to " + workDirOnLinux);
  getch();

  show("ninth");
  file = new File("WorkWithFiles.java");
  System.out.println("Absolute path of file " +
   file.getName() + " is : " + file.getAbsolutePath());
  getch();

  show("tenth");
  if (file.isFile())
   System.out.println(file.getName() + " is a file");
  if (new File(workDirOnLinux).isDirectory())
   System.out.println(workDirOnLinux + " is a directory");
  getch();

  show("eleventh");
  ArrayList < String > treeList = new ArrayList < String > ();
  try {
   buildTree(workDirOnLinux, treeList, 0);
  } catch (IOException ex) {
   ex.printStackTrace();
  }
  for (String str: treeList) {
   System.out.println(str);
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

 static void buildTree(String path, ArrayList < String > treeList, int rec_level)
 throws IOException {
  if (new File(path).exists() == false)
   throw new IOException();
  if (rec_level < 0)
   throw new IllegalArgumentException();
  JavaFileFilter filter = new JavaFileFilter();
  File file = new File(path);
  if (rec_level == 0) treeList.add(path);
  for (String content: file.list()) {
   String tempStr = "";
   for (int i = 0; i < rec_level + 1; i++)
    tempStr = tempStr + "\t";
   if (filter.accept(new File(path + File.separator + content)))
    treeList.add(tempStr + content);
   if (new File(path + File.separator + content).isDirectory()) {
    treeList.add(tempStr + content);
    buildTree(path + File.separator + content, treeList, rec_level + 1);
   }

  }
 }
}
