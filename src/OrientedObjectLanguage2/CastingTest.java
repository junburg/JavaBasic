package OrientedObjectLanguage2;

public class CastingTest {

	public static void main(String[] args) {
		Car3 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		// car.water();  에러! Car타입의 참조변수로는 water()를 호출할 수 없다.
		
		fe2 = (FireEngine)car;
		fe2.water();
	}

}
class Car3 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car3 {
	void water() {
		System.out.println("water!!!");
	}
}