import java.util.Random;

public class RandomArray{

private int[] array;

public RandomArray(){
	array = new int[50]; 
	for(int e : array){
		e = new Random().nextInt()%200-100;
		System.out.print(e + " ");
		
	}

	
}

public int minElement(){
int min = array[0];
	for(int e : array){
	if(e > 0 && e < min) min = e;
}
return min;
}

public void swapNegativeToMinimal(){
int min = minElement();
	System.out.println();
	for(int e : array){
		if(e < 0) e = min;
	System.out.print(e + " ");
	}
}
	public static void main(String[] args){
		RandomArray ra = new RandomArray();
		System.out.println("\nMinimal element : " + ra.minElement());
		ra.swapNegativeToMinimal();
		
	} 
}