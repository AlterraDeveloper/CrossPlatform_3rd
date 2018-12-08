public class Start{
	public static void main(String[] args){
		MyThreadC myThread1 = new MyThreadC(80);
		MyThreadI myThread2 = new MyThreadI();
		//new Thread(myThread1).start();	
		//new Thread(myThread2).start();
		
		
		//new Thread(new Runnable(){
		//public void run(){
		//	System.out.println("Anonymous class...");
		//}
		//}).start();
		
		Runnable r = () ->
		{
			for(int i=0;i<5;i++)
			System.out.println("Thread "+ i+10 +" running...");
		};
		new Thread(r).start();
		//new Thread( () -> 
		//System.out.println("Anonymous class...")).start();
		
		}
}