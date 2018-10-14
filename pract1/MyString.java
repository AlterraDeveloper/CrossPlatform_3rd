import java.io.IOException;
import java.io.StringReader;
import java.util.*;

class MyString {

    public static void main(String[] args) {
        show("first");
        String str1_1 = "hello";
        String str1_2 = "HELLO";
        System.out.println(str1_1 + " == " + str1_2 + " : " + (str1_1 == str1_2));
        System.out.println(str1_1 + " equals() " + str1_2 + " : " + str1_1.equals(str1_2));
        System.out.println(str1_1 + " equalsIgnoreCase() " + str1_2 + " : " + str1_1.equalsIgnoreCase(str1_2));
        getch();

        show("second");
        String str2_1 = "qwerty";
        String str2_2 = "zxcvb";
        if (str2_1.compareTo(str2_2) > 0)
            System.out.println(str2_2 + " before " + str2_1);
        else System.out.println(str2_1 + " before " + str2_2);
        getch();

        show("third");
        String address = "Kyrgyzstan Bishkek street Gandi home 155 room 37";
        System.out.println(address.substring(26, 26 + 5));
        System.out.println(address.substring(address.indexOf("street"), address.indexOf(" ", address.indexOf("street"))));
        System.out.println(address.indexOf('d', 10));
        getch();

        show("fourth");
        String str4 = "travel";
        for (int index = 0; index < str4.length(); index++)
            System.out.println(str4.charAt(index));
        System.out.println();
        StringReader stringReader = new StringReader(str4);
        for (int index = 0; index < str4.length(); index++)
            try {
                System.out.println((char) stringReader.read());
            } catch (IOException e) {
            }
        getch();

        show("fifth");
        String str5 = "documentation";
        StringBuffer stringBuffer = new StringBuffer(str5);
        System.out.println("original object : " + str5);
        System.out.println("reverse object : " + stringBuffer.reverse());
        getch();

        show("sixth");
        String str6 = "one two three four five six";
        StringTokenizer stringTokenizer = new StringTokenizer(str6, " ");
        Stack<String> stack = new Stack<String>();
        StringBuffer sb = new StringBuffer();
        StringBuffer rsb = new StringBuffer();
        while (stringTokenizer.hasMoreElements())
            stack.push(stringTokenizer.nextToken());
        while (!stack.isEmpty()) {
            sb.append(stack.peek() + " ");
            rsb.append(new StringBuffer(stack.pop()).reverse().toString() + " ");
        }
        System.out.println("original object : " + str6);
        System.out.println("reverse object : " + sb);
        System.out.println("reverse object with reverse tokens : " + rsb);
        getch();

        show("seventh");
        String str7 = "Oracle";
        System.out.println(str7.toLowerCase());
        System.out.println(str7.toUpperCase());
        getch();

        show("eighth");
        String str8 = "   trimmed string    ";
        System.out.println("original : "+ str8);
        System.out.println(str8.trim());
        getch();

        show("ninth");
        String str9 = "one,two,three,four";
        System.out.println("from String.split() : ");
        for(String s : str9.split(","))
            System.out.println(s);
        System.out.println("from StringTokenizer : ");
        StringTokenizer tokenizer = new StringTokenizer(str9,",");
        while (tokenizer.hasMoreTokens())
            System.out.println(tokenizer.nextToken());
        getch();

    }


    public static void show(String msg) {
        System.out.println("==========");
        System.out.println(msg + " task");
        System.out.println("==========");
    }

    public static void getch() {
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

}
