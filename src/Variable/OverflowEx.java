package Variable;

public class OverflowEx {

	public static void main(String[] args) {
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1= " + (short)(sMin-1));// �ּҰ����� -1�� �ϴ� �ִ밪�� �Ǿ����
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1= " + (short)(sMax+1));// �ִ밪���� +1�� �ϴ� �ּҰ��� �Ǿ����
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1= " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1= " + (int)++cMax);
		
		

	}

}
