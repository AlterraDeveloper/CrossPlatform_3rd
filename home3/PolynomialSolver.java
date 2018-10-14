import java.util.*;
import java.lang.*;

public class PolynomialSolver{

public static double calculateT1(){

int a = 1,b = 2,c = 3,d = 4;
double x,y;

System.out.print("Enter value of x : ");
Scanner scan = new Scanner(System.in);
x = scan.nextDouble();

System.out.print("Enter value of y : ");
scan = new Scanner(System.in);
y = scan.nextDouble();

double result = (1/(double)c)/((b/a)*Math.log1p​(a*x+b) + (d/y)*Math.log1p​(y*x+d));

return result;
}

public static double calculateT2(){
int a = 1, b = 2, c = 3;
double x;

System.out.print("Enter value of x : ");
Scanner scan = new Scanner(System.in);
x = scan.nextDouble();

double sqrt = Math.sqrt(Math.pow(c,2)-Math.pow(b,2));
double tang = Math.tan(a*x);
double result = ((double)1/(2*a*b))*Math.log1p​((sqrt*tang+2)/(sqrt*tang-2));

return result;

}

public static void main(String[] args){
	System.out.println("Result of expression t1 equals : "+ PolynomialSolver.calculateT1());
	System.out.println("Result of expression t2 equals : "+ PolynomialSolver.calculateT2());
}
}