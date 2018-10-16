import java.util.Scanner;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Math;

public class Numbers {
    public static void main(String[] args) {
        show("First");
        System.out.print("Type something : ");
        Scanner scanner = new Scanner(System.in);
        try {
            Integer.parseInt(scanner.next());
            System.out.println("It's a integer number!");
        } catch (NumberFormatException e) {
            System.out.println("It's NOT a integer number!");
        }
        getch();

        show("Second");
        Float float1 = new Float(0.005f);
        Float float2 = new Float(float1 + 0.04f);
        System.out.println("Is " + float1 + " equals " + float2 + " ? " +
                (float1.equals(float2) ? "Yes" : "No"));
        getch();

        show("Third");
        System.out.println("Is " + float1 + " equals " + float2 + " accurate to 0.05f ? " +
                ((float) Math.abs(float1 - float2) <= 0.05f ? "Yes" : "No"));
        getch();

        show("Fourth");
        double double1 = 1561.98949812;
        float float3 = 5.50198f;
        System.out.println("Rounding double value " + double1 + " : " + Math.round(double1));
        System.out.println("Rounding float value " + float3 + " : " + Math.round(float3));
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