import java.util.*;
import java.lang.Math;

public class Triangle
{

double hypotenuse,catet1,catet2;
double[] angles;
double perimeter;
double square;

public Triangle(double catet1,double catet2)
{
	this.catet1 = catet1;
	this.catet2 = catet2;
	hypotenuse = calculateHypotenuse();
	angles = new double[3];
	angles[0] = 90.0;
	angles[1] = calculateAngle();
	angles[2] = 90.0 - angles[1];
	perimeter = calculatePerimeter();
	square = calculateSquare();
}

private double calculateHypotenuse()
{
	return 	Math.sqrt(Math.pow(catet1,2)+Math.pow(catet2,2));
}

private double calculateAngle()
{
	return (Math.acos(catet1/hypotenuse))*(180.0d/Math.PI);
}

private double calculatePerimeter()
{
	return hypotenuse+catet1+catet2;
}

private double calculateSquare(){
	return 0.5*catet1*catet2;
}

public void info()
{
	System.out.printf("Hypotenuse : %.2f\nFirst catet : %.2f\nSecond catet : %.2f\n",
					hypotenuse,catet1,catet2);
	System.out.printf("Angles: %.2f %.2f %.2f\n",angles[0],angles[1], angles[2]);
	System.out.printf("Square: %.2f\n",square);
	System.out.printf("Perimeter: %.2f\n",perimeter);
}

public static void main(String[] args)
{

		if(args.length == 0 || args.length>2){
		System.out.println("Incoorect args!\nExample: java Triangle 2 5");
		return;	
		}		
	
		double f_catet = Double.parseDouble(args[0]);
		double s_catet = Double.parseDouble(args[1]);

		Triangle triangle = new Triangle(f_catet,s_catet);
		triangle.info();
		
}	
}