package CollectionFramework;

public class AsciiPrint {

	public static void main(String[] args) {
		char ch = ' ';
		// 공백이후의 문자들을 출력한다.
		for(int i = 0; i< 95; i++) {
			System.out.print(ch++);
		}
	}

}
