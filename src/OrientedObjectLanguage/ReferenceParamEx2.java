package OrientedObjectLanguage;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		int[] x = {10};
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
		// 배열도 참조형 변수이므로 주소 값을 매개변수로 넣어준다.
		// 그러므로 값도 바뀐다!
	}
	
	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}

}
