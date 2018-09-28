import java.util.*;

public class Week{
	public static void main(String[] args){
		System.out.print("Введите номер дня недели(1-7): ");
		Scanner scan = new Scanner(System.in);
		int num = 0;

		try{
 		num = Integer.parseInt(scan.nextLine());
		}catch(NumberFormatException ex){ }

		switch(num){
		case 1: System.out.println("Понедельник");break;
		case 2: System.out.println("Вторник");break;
		case 3: System.out.println("Среда");break;
		case 4: System.out.println("Четверг");break;
		case 5: System.out.println("Пятница");break;
		case 6: System.out.println("Суббота");break;
		case 7: System.out.println("Воскресенье");break;
		default:  System.out.println("ОШИБКА ВВОДА!!!!!!");
		}
	}
}