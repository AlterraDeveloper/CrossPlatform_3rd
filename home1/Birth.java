import java.util.*;

public class Birth
{
	public static void main(String[] args){
		Calendar cal = new GregorianCalendar(1998,10,24);
		Date date = new Date();

		show("First");
		System.out.println("Current date: "+ date);
		getch();

		show("Second");
		System.out.println("My birthday: "+ cal.getTime());
		getch();
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