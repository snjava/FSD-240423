import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
	public static void main(String[] args) {
		ThrowsDemo demo = new ThrowsDemo();
		try {
			demo.m1("test.txt");
		} catch(FileNotFoundException ex) {
			System.out.println("File is not available....");
		}
	}
	public void m1(String location) throws FileNotFoundException {
		System.out.println("m1() STARTED");
		m2(location);
		System.out.println("m1() END");
	}
	public void m2(String location) throws FileNotFoundException {
		FileReader fileRead = new FileReader(location);
	}
}
