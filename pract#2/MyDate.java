import java.util.*;
import java.text.*;

public class MyDate{

	
	public static void main(String[] args){
		
		show("First");
		Date date = new Date();		
		System.out.println("Current date: "+date);
		getch();

		show("Second");
		Calendar cal = new GregorianCalendar();
		System.out.println("Current date: " + cal.getTime());
		getch();

		show("Third");
		Date data1 = new Date(-1900,5,15);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(data1));
		getch();
	}
	
	public static Calendar method1(Date date)
	{
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);		
		return cal;
	}
	
	public static Date method2(Calendar calen)
	{
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