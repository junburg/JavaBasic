package JavaLangPackageAndUtilClasses;
import static java.lang.System.*;
import static java.lang.Math.*;
public class MathEx2 {

	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		
		out.println("i =" + i);
		out.println("-i =" + (-i));
		
		try {
			out.printf("negateExact(%d)= %d%n", 10, negateExact(10));
			out.printf("negateExact(%d)= %d%n", -10, negateExact(-10));
			out.printf("negateExact(%d)= %d%n", i, negateExact(i));
		} catch(ArithmeticException e) {
			// i�� long Ÿ������ ĳ�����ϰ� negateExact(long a)�� ȣ��
			out.printf("negateExact(%d)= %d%n", (long)i, negateExact((long)i));
		}
	}

}
