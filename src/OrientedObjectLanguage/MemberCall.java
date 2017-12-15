package OrientedObjectLanguage;

public class MemberCall {

	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	static int cv2 = new MemberCall().iv;

	static void staticMethod1() {
		System.out.println(cv);
		// System.out.println(iv);// 클래스 메서드에서 인스턴스 변수를 사용불가.
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체를 생성한 후에 인스턴스 변수의 참조가능
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}

	static void staticMethod2() {
		staticMethod1();
		// instanceMethod1();
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}

	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}

	public static void main(String[] args) {

	}

}
