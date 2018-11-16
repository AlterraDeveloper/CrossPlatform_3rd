import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class MyRegex {


    public static void main(String[] args) {

        show("first");
        String str = "This is Jim and Timothy";
        String pattern = "[TJ]im";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        if (m.find() == true) {
            System.out.println(m.group());
            int start = m.start();
            int end = m.end();
            System.out.println(start + " " + end);
            if (m.find(end + 1)) {
                System.out.println(str.substring(m.start(), m.end()));
            }
        };
        getch();

        show("second");
        str = "This is Jim and Tom";
        Matcher m1 = p.matcher(str);
        System.out.println(m1.replaceAll("John"));
        getch();

        show("third");
        str = "My dad and My mom";
        System.out.println("Original string : " + str);
        p = Pattern.compile("(\\w)*[My](\\w)*");
        m = p.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            m.appendReplacement​(sb, "Our");
        }
        m.appendTail(sb);
        System.out.println("Replace \"My\" on \"Our\" : " + sb.toString());
        getch();

        show("fourth");
        String text = "The words are town torn ton toon house.";
        pattern = "\\st(\\w)*o(\\w)*";
        p = Pattern.compile(pattern);
        m = p.matcher(text);
        System.out.println("Words searched by pattern \"\\st(\\w)*o(\\w)*\" in string \"The words are town torn ton toon house.\" : ");
        while (m.find()) {
            System.out.println(m.group());
        }
        getch();

        show("fifth");
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            pattern = "^a";
            p = Pattern.compile(pattern);
            System.out.println("Words searched by pattern \"^a\" : ");
            while (true) {
                try {
                    str = br.readLine();
                } catch (IOException e) {}
                if (str == null) break;
                else {
                    m = p.matcher(str);
                    try {
                        System.out.println(m.group());
                    } catch (IllegalStateException e) {
                        System.out.println("Matches not found");
                    }
                    m.reset();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        getch();

        show("sixth");
        text = "This is line 1\nHere is line 2\nThis is line 3\n";
        pattern = "\\d$";
        p = Pattern.compile(pattern);
        m = p.matcher(text);
        System.out.println("Words searched by pattern \"\\d$\" : ");
        while (m.find()) {
            System.out.println(m.group());
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