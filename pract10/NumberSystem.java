public class NumberSystem {
 public static void main(String[] args) {
  int number = 0;
  String string;

  show("First");
  string = "111111111111";
  try {
   number = Integer.parseInt(string, 2);
  } catch (NumberFormatException e) {
   e.printStackTrace();
  }
  System.out.println(string + " in hexadecimal format : " + Integer.toHexString(number));
  System.out.println(string + " in octal format : " + Integer.toOctalString(number));
  getch();

  show("Second");
  string = "3A7D";
  try {
   number = Integer.parseInt(string, 16);
  } catch (NumberFormatException e) {
   e.printStackTrace();
  }
  System.out.println(string + " in binary format : " + Integer.toBinaryString(number));
  getch();

  show("Third");
  string = "765F";
  try {
   number = Integer.parseInt(string, 16);
  } catch (NumberFormatException e) {
   e.printStackTrace();
  }
  System.out.println(string + " in octal format : " + Integer.toOctalString(number));
  getch();

  show("Fourth");
  string = "1111111";
  try {
   number = Integer.parseInt(string, 2);
  } catch (NumberFormatException e) {
   e.printStackTrace();
  }
  System.out.println(string + " in decimal format : " + number);
  getch();

  show("Fifth");
  string = "0426";
  try {
   number = Integer.parseInt(string, 8);
  } catch (NumberFormatException e) {
   e.printStackTrace();
  }
  System.out.println(string + " in decimal format : " + number);
  getch();

  show("Sixth");
  string = "FFFF";
  try {
   number = Integer.parseInt(string, 16);
  } catch (NumberFormatException e) {
   e.printStackTrace();
  }
  System.out.println(string + " in decimal format : " + number);
  getch();

  show("Seventh");
  string = "299";
  try {
   number = Integer.parseInt(string);
  } catch (NumberFormatException e) {
   e.printStackTrace();
  }
  System.out.println(string + " in binary format : " + Integer.toBinaryString(number));
  System.out.println(string + " in octal format : " + Integer.toOctalString(number));
  System.out.println(string + " in hexadecimal format : " + Integer.toHexString(number));
  getch();

  show("Eigtht");
  string = "771";
  try {
   number = Integer.parseInt(string);
  } catch (NumberFormatException e) {
   e.printStackTrace();
  }
  System.out.println(string + " after ~ operation : " +
   String.format("%32s", Integer.toBinaryString(~number)));
  System.out.println(string + " after \"adding up to two\" operation : " +
   String.format("%32s", Integer.toBinaryString((~number)+1)));
  getch();

  show("Ninth");
  System.out.println("Result of operation " + string + " + ((~" + string + ")+1) : "
    + (number + ((~number)+1)) );
  getch();

  show("Tenth");
  number = -1;
  System.out.println("Number " + number + " after operation \"adding up to two\" representing in 32-bit word : "
  + String.format("%32s", Integer.toBinaryString((~number)+1)));
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
