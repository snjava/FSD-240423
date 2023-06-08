public class InterfaceDemo {
	public static void main(String[] args) {
		Vehical vel = new R15();
		vel.brand();
		vel.fuel();
		vel.noOfWheels();
	}
}
interface Vehical {
	int a = 10; 	// public static final int a = 10;
	void fuel(); 	// public abstract void fuel();
	void brand();
	void noOfWheels();
}
abstract class Bike implements Vehical {
	public void noOfWheels() {
		System.out.println("Bike Has 2 Wheels.");
	}
}
abstract class Yamaha extends Bike {
	public void brand () {
		System.out.println("Brand is : Yamaha");
	}
}
class R15 extends Yamaha {
	public void fuel() {
		System.out.println("Fuel type is pertrol.");
	}
}












