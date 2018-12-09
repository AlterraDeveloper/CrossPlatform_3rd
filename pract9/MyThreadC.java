public class MyThreadC extends Thread{

	String message;
	boolean done;

	public MyThreadC(){}

	public MyThreadC(Runnable r){
		super(r);
		message = "Anonymous ";
	}

	public void run(){
		int n=0;
			while (!done) {
					System.out.println((message == null ? "" : message) + "Class Thread running...");
					if(n++ == 10) shutDown();
			}
			try{
					super.sleep(2500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println((message == null ? "" : message) + "Class Thread stopped...");
	}

	public void shutDown(){
		done = true;
	}
}
