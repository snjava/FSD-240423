public class SuperKeywordDemo {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.print();
	}
}
class Parent {
	public Parent(int a) {
		System.out.println("1 int Param constrcutor from Parent"); 
	}
	int a = 10;
	public void m1() {
		System.out.println("m1() from Parent");
	}
}
class Child extends Parent{
	public Child() {
		super(12); // access the constructor of parent class
		System.out.println("No Param constrcutor from Child"); 
	}
	int a = 20;
	public void m1() {
		System.out.println("m1() from Child");
	}
	public void print() {
		System.out.println(super.a); // access Super class variable
		super.m1();  // access super class method
	}
}
