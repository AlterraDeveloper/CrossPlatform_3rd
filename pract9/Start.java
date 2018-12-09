public class Start{
	public static void main(String[] args){

		MyThreadC myThread = new MyThreadC();

		MyThreadC myThread1 = new MyThreadC(new Runnable(){
		public void run(){
			for(int i=0;i<3;i++)
			System.out.println("Anonymous class running...");
		}
		});
		MyThreadI myThread2 = new MyThreadI();

		new Thread(myThread).start();
		new Thread(myThread1).start();
		new Thread(myThread2).start();

		}
}
