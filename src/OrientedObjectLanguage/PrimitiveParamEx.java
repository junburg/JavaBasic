package OrientedObjectLanguage;

class Data { int x; }

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		// d.x의 값이 변경된 것이 아니다. change메서드의 매개변수 x의 값이 변경된 것이다.
		// 원본이 아닌 복사본이 변경된 것
		// 기본형 매개변수는 변수에 저장된 값만 읽을 수 만 있을 뿐 변경할 수는 없다.
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	
	}
	
	static void change(int x){ 
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
