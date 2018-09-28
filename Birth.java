import java.util.*;

public class Birth
{
	public static void main(String[] args){
		Calendar cal = new GregorianCalendar(1998,10,24);
		Date date = new Date();

		System.out.println("Current date: "+ date);
		System.out.println("My birthday: "+ cal.getTime());
	}
}