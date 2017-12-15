package OrientedObjectLanguage;
class Tv{
	
	String color;
	boolean power;
	int channel;
	
	void power() { power =! power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

public class TvTest {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1; //데이터 값이 아닌 데이터 값이 들어있는 참조변수의 주소를 대입하므로 
		//데이터 값이 해당 선언 후에 바뀌었더라도 t2의 값에 바뀐 t1의 값이 들어간다.
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		

	}

}
