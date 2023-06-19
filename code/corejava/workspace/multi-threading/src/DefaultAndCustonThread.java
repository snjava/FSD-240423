
public class DefaultAndCustonThread {
	public static void main(String[] args) {
		System.out.println("Started main() method");
		Thread th = Thread.currentThread();
		System.out.println(th);
		CustomThread ct = new CustomThread();
		ct.setName("my-thread");
		ct.setPriority(10);
		ct.start();
		
		for(int i = 1 ; i<=10; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("Ended main() method");
	}
}

class CustomThread extends Thread {
	public void run() {
		System.out.println("Started Custom thread");
		Thread th = Thread.currentThread();
		System.out.println(th);
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ended Custom thread");
	}
}














