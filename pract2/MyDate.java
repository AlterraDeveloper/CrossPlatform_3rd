import java.util.*;
import java.text.*;

public class MyDate {


    public static void main(String[] args) {

        show("First");
        Date date = new Date();
        System.out.println("Current date using class Date : "
                + new SimpleDateFormat("EEE ,dd MMMM, yyyy").format(date));
        getch();

        show("Second");
        Calendar cal = new GregorianCalendar();
        System.out.println("Current date using class Calendar : "
                + new SimpleDateFormat("EEE ,dd MMMM, yyyy").format(cal.getTime()));
        getch();

        show("Third");
        method1(date);
        method2(cal);
        getch();

        show("Forth");
        Date date1 = new Date(111, 9, 27);
        System.out.println("Formating date 27.10.2011 into \"dd\\MM\\yyyy\" " + new SimpleDateFormat("dd/MM/yyyy").format(date1));
        getch();

        show("Fifth");
        String stringDate = "12.10.1996";
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            System.out.println("Parsing string " + stringDate + " to Date... " +
                    new SimpleDateFormat("EEE ,dd MMMM, yyyy")
                            .format(dateFormat.parse(stringDate)));
        } catch (Exception exception) {
        }
        getch();

        show("Sixth");
        Date date2 = new Date();
        Date date3 = new Date(date2.getTime() + 5 * 24 * 60 * 60 * 1000);
        System.out.println("Date before adding 5*24*60*60*1000 : " +
                new SimpleDateFormat("dd.MM.yyyy").format(date2));
        System.out.println("Date after adding 5*24*60*60*1000 : " +
                new SimpleDateFormat("dd.MM.yyyy").format(date3));

        Calendar calendar = new GregorianCalendar();
        System.out.println("Calendar before adding 5*24*60*60*1000 : " +
                new SimpleDateFormat("dd.MM.yyyy").format(calendar.getTime()));
        Calendar calendar1 = new GregorianCalendar();
        calendar1.setTime(new Date(calendar.getTime().getTime() + 5 * 24 * 60 * 60 * 1000));
        System.out.println("Calendar after adding 5*24*60*60*1000 : " +
                new SimpleDateFormat("dd.MM.yyyy").format(calendar1.getTime()));
        getch();

        show("Seventh");
        Date date4 = new Date();
        Date date5 = new Date(98, 10, 24);
        System.out.println("How many days between " +
                new SimpleDateFormat("dd.MM.yyyy").format(date5) + " and " +
                new SimpleDateFormat("dd.MM.yyyy").format(date4));
        System.out.println(Math.abs((date5.getTime() - date4.getTime()) / (24 * 60 * 60 * 1000)) + " days");
        getch();

        show("Eighth");
        System.out.println("Is " + new SimpleDateFormat("dd.MM.yyyy").format(date4) + " equals "
                + new SimpleDateFormat("dd.MM.yyyy").format(date5) + " ? " +
                (date4.equals(date5) == true ? "Yes" : "No"));
        System.out.println("Is " + new SimpleDateFormat("dd.MM.yyyy").format(date5) + " before "
                + new SimpleDateFormat("dd.MM.yyyy").format(date4) + " ? " +
                (date5.before(date4) == true ? "Yes" : "No"));
        getch();

        show("Ninth");
        System.out.println("Using Calendar constants");
        Calendar calendar2 = new GregorianCalendar();
        System.out.print("Day of week : ");
        switch (calendar2.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
        System.out.println("Day of month : " + calendar2.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of week in month : " + calendar2.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Day of year : " + calendar2.get(Calendar.DAY_OF_YEAR));
        getch();

        show("Tenth");
        long moment1 = System.currentTimeMillis();
        long mean = 0;
        System.out.println("Moment 1 : " + moment1);
        int[] arr = new int[10000];
        for(int e : arr){
            e = new Random().nextInt();
            mean += e;
            System.out.print(e + " ");
        }
        System.out.println("\nThe arithmetic mean : " + mean/arr.length);
        long moment2 = System.currentTimeMillis();
        System.out.println("Moment 2 : " + moment2);
        System.out.println("Difference between moments : " + (moment2-moment1) + " ms");
        getch();
    }

    public static Calendar method1(Date date) {
        System.out.print("Converting Date to Calendar...");
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        System.out.println("Ok");
        return cal;
    }

    public static Date method2(Calendar calen) {
        System.out.print("Converting Calendar to Date...");
        System.out.println("Ok");
        return calen.getTime();
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