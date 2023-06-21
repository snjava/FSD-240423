
public class JoinSuspendResume {
	public static void main(String[] args) {
		TableThread th = new TableThread();
		th.start();
		System.out.println("Main Thread Started");
		//th.suspend();
		try {
			th.join(5000); // pause current thread, and wait for another thread to complete
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 1; i<=10; i++) {
			System.out.println("i = " + i );
		}
		System.out.println("Main Thread Ends");
		//th.resume();
	}
}

class TableThread extends Thread {
	public void run() {
		System.out.println("Table Thread Started");
		for(int i = 1; i<=10; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Table Thread Ends");
	}
}












