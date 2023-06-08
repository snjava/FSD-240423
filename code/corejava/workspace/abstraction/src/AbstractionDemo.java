public class AbstractionDemo {
	public static void main(String[] args) {
		Car car = new Fortuner();
		car.brand();
		car.fuel();
		car.noOfWheel();
	}
}
abstract class A {
	public void m1() {
		
	}
	public void m2() {
		
	}
}
abstract class Car {
	public Car() {
		System.out.println("Car Class");
	}
	public abstract void fuel();
	public abstract void brand();
	final public void noOfWheel() {
		System.out.println("Car has 4 wheels and 1 spare wheel");
	}
}
abstract class Toyota extends Car {
	public void brand() {
		System.out.println("Brand is Toyota");
	}
}
class Fortuner extends Toyota {
	public void fuel() {
		System.out.println("Its a Disel Car");
	}
}






