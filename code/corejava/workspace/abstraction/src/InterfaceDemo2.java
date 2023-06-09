public class InterfaceDemo2 {
	public static void main(String[] args) {

	}
}

interface Inter1 {
	int a = 20;
	public void m1();
}
interface Inter2 {
	int b = 30;
	public void m2();
}
//============Multiple Inheritance ====================
// One interface can extends more then one interface 
interface Inter3 extends Inter1, Inter2 {
	int c= 40;
	public void m3();
}
// One class can implements more than one interface
abstract class Demo implements Inter1, Inter2 {
	
}
// One class can extends another class and implements more than one interface
class Test extends Demo implements Inter1, Inter2, Inter3 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
}














