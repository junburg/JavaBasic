package OrientedObjectLanguage;

class Data3 {
	int value;
}

class Data4 {
	int value;
	
	Data4(int x) {
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data3 d1 = new Data3();
		Data4 d2 = new Data4(3);

	}

}
