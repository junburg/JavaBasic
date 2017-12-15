package OrientedObjectLanguage;

public class ReturnTest {

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3, 5, result2);
		System.out.println(result2[0]);

	}

	int add(int a, int b){
		return a+b;
	}
	
	// 기본형 반환값을 가진 메서드와 다르게 참조형을 매개변수로 받는 메서드는 반환값이 없어도 값을 바꿀 수 있다.
	void add(int a, int b, int[] result){ //
		result[0] = a + b;
	}
}
