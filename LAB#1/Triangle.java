import java.util.*;

public class Triangle{
	public static void main(String[] args){

		if(args.length == 0 || args.length>2){
		System.out.println("Incoorect args!\nExample: java Triangle 2 5");
		return;		
}	
	
		int f_catet = Integer.parseInt(args[0]);
		int s_catet = Integer.parseInt(args[1]);

		double gip = Math.sqrt(Math.pow(f_catet,2)+Math.pow(s_catet,2));
		show("First");
		System.out.println("Gipotenuza: " + gip);
		
		double f_angle = (Math.cos(f_catet/gip)/Math.PI)*180;
		
		System.out.println("Angles: "+90.0 +"  "+ Math.rint(f_angle) +" "+Math.rint(90 - f_angle) );
		
		System.out.println("Square: "+0.5*f_catet*s_catet);
		System.out.println("Perimeter: "+(f_catet+s_catet+gip));
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