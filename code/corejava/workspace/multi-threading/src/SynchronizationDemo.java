public class SynchronizationDemo {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Thread1 t1 = new Thread1(printer);
		Thread2 t2 = new Thread2(printer);
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	Printer printer;
	public Thread1(Printer printer) {
		this.printer = printer;
	}
	public void run() {
		//printer.printTable(5);
		synchronized(printer) { // Synchronized Block
			for(int i=1 ; i<=10 ; i++) {
				printer.printValue("5 * " + i + " = " + (5*1)); // 5 * 1 = 5
				try {
					Thread.sleep(1000);
					if(i==5) {
						printer.wait(); // release the lock and go into waiting state
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Thread2 extends Thread {
	Printer printer;
	public Thread2(Printer printer) {
		this.printer = printer;
	}
	public void run() {
		//printer.printTable(12);
		synchronized(printer) { // Synchronized Block
			for(int i=1 ; i<=10 ; i++) {
				printer.printValue("12 * " + i + " = " + (12*1)); // 12 * 1 = 12
			}
			printer.notifyAll(); // to notify all thread which is in waiting state
		}
	}
}

class Printer {
	public synchronized void printTable(int num) {
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(num + " * " + i + " = " + (num*1)); // 5 * 1 = 5
		}
	}
	
	public void printValue(String value) {
		System.out.println(value);
	}
} 








