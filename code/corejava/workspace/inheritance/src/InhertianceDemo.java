public class InhertianceDemo {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		ch.m1();
		ch.m2();
	}
}
class Parent {
	int a = 10;
	public void m1() {
		System.out.println("Parent class m1()");
	}
}
class Child extends Parent {
	int b = 20;
	public void m2() {
		System.out.println("Child class m2()");
		//System.out.println(a);
		//m1();
	}
}
