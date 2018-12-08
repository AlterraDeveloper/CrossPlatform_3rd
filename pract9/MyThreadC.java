public class MyThreadC extends Thread{
	
	private long minPrime;

	public MyThreadC(){}

	public MyThreadC(long minPrime){
		this.minPrime = minPrime;
	}
	
	public void run(){
		for(int i=0;i<5;i++)
		System.out.println("Thread "+ minPrime +" running...");
	} 
}