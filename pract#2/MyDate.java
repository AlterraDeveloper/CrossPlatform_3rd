import java.util.*;
import java.text.*;

public class MyDate{

	
	public static void main(String[] args){
		
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
		Date date1 = new Date(111,9,27);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(date1));
		getch();

		show("Fifth");
		String stringDate = "12.10.1996";
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		try {
			System.out.println("Parsing string " + stringDate + " to Date... " +
					new SimpleDateFormat("EEE ,dd MMMM, yyyy")
							.format(dateFormat.parse(stringDate)));
		}catch(Exception exception){
		}
		getch();

		show("Sixth");
		Date date2 = new Date();
		Date date3 = new Date(date2.getTime()+5*24*60*60*1000);
		System.out.println("Date before adding 5*24*60*60*1000 : " +
				new SimpleDateFormat("dd.MM.yyyy").format(date2));
		System.out.println("Date after adding 5*24*60*60*1000 : " +
				new SimpleDateFormat("dd.MM.yyyy").format(date3));

		Calendar calendar = new GregorianCalendar();
		System.out.println("Calendar before adding 5*24*60*60*1000 : " +
				new SimpleDateFormat("dd.MM.yyyy").format(calendar.getTime()));
		Calendar calendar1 = new GregorianCalendar();
		calendar1.setTime(new Date(calendar.getTime().getTime()+5*24*60*60*1000));
		System.out.println("Calendar after adding 5*24*60*60*1000 : " +
				new SimpleDateFormat("dd.MM.yyyy").format(calendar1.getTime()));
		getch();
//
//		show();
//		getch();
//
//		show();
//		getch();
	}
	
	public static Calendar method1(Date date)
	{
		System.out.print("Converting Date to Calendar...");
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		System.out.println("Ok");
		return cal;
	}
	
	public static Date method2(Calendar calen)
	{
		System.out.print("Converting Calendar to Date...");
		System.out.println("Ok");
		return calen.getTime();
	}
	
	public static void show(String msg){
		System.out.println("==========");
		System.out.println(msg);
		System.out.println("==========");
	}

	public static void getch(){
		try{
			System.in.read();
		}catch (Exception e){}		
	}
	
}