
public class ThreadByRunnable {
	public static void main(String[] args) {
		Thread3 thread3= new Thread3();
		Thread th = new Thread(thread3); 
		th.start();
	}
}

class Thread3 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread());
	}
}

