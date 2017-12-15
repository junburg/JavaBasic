package JavaLangPackageAndUtilClasses;

public class StringClassConstructorMethod {

	public static void main(String[] args) {
		String s = new String("Hello");
		System.out.println(s);

		char[] c = { 'H', 'E', 'L', 'L', 'O' };
		String s2 = new String(c);
		System.out.println(s2);

		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);
		System.out.println(s3);

		String s4 = "Hello";
		String n = "0123456";
		char c2 = s4.charAt(1);
		char c3 = n.charAt(1);
		System.out.println(c2);
		System.out.println(c3);

		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);

		String s5 = "Hello";
		String s6 = s5.concat("World");
		System.out.println(s6);

		String s7 = "abcdefg";
		boolean b = s7.contains("bc");
		System.out.println(b);

		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");
		System.out.println(b2);

		String s8 = "Hello";
		boolean b3 = s8.equals("Hello");
		boolean b4 = s8.equals("hello");
		System.out.println(b3);
		System.out.println(b4);

		String s9 = "Hello";
		boolean b5 = s9.equalsIgnoreCase("HELLO");
		boolean b6 = s9.equalsIgnoreCase("heLLo");
		System.out.println(b5);
		System.out.println(b6);

		String s10 = "Hello";
		int idx1 = s10.indexOf('o');
		int idx2 = s10.indexOf('k');
		System.out.println(idx1);
		System.out.println(idx2);

		String s11 = "Hello";
		int idx3 = s11.indexOf('e', 0);
		int idx4 = s11.indexOf('e', 2);
		System.out.println(idx3);
		System.out.println(idx4);

		String s12 = "ABCDEFG";
		int idx5 = s12.indexOf("CD");

		String s13 = new String("abc");
		String s14 = new String("abc");
		boolean b7 = (s13 == s14);
		boolean b8 = s13.equals(s14);
		boolean b9 = (s13.intern() == s14.intern());
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(b9);

		String s15 = "java.lang.Object";
		int idx6 = s15.lastIndexOf('.');
		int idx7 = s15.indexOf('.');
		System.out.println(idx6);
		System.out.println(idx7);

		String s16 = "java.lang.java";
		int idx8 = s16.lastIndexOf("java");
		int idx9 = s16.indexOf("java");
		System.out.println(idx8);
		System.out.println(idx9);

		String s17 = "Hello";
		int length = s17.length();
		System.out.println(length);

		String s18 = "Hello";
		String s19 = s18.replace('H', 'C');
		System.out.println(s19);

		String s20 = "AABBAABB";
		String s21 = s20.replaceAll("BB", "AA");
		System.out.println(s21);

		String s22 = "AABBAABB";
		String s23 = s22.replaceFirst("BB", "AAA");
		System.out.println(s23);

		String s24 = "dog, cat, bear";
		String[] arr = s24.split(", ");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

		String s25= "dog, cat, bear";
		String[] arr2 = s25.split(", ", 2);
		for (int k = 0; k < arr2.length; k++) {
			System.out.println(arr2[k]);
		}
		
		String s26 ="java.lang.Object";
		boolean b10 = s26.startsWith("java");
		boolean b11 = s26.startsWith("lang");
		System.out.println(b10);
		System.out.println(b11);
		
		String s27 = "java.lang.Object";
		String s28 = s27.substring(10);
		String s29 = s27.substring(5, 9);
		System.out.println(s28);
		System.out.println(s29);
		
		String s30 = "Hello";
		String s31 = s30.toLowerCase();
		System.out.println(s31);
		
		String s32 = "Hello";
		String s33 = s32.toString();
		System.out.println(s33);
		
		String s34 = "Hello";
		String s35 = s34.toUpperCase();
		System.out.println(s35);
		
		String s36 = "    Hello World    ";
		String s37 = s36.trim();
		System.out.println(s37);
		
		String s38 = String.valueOf(true);
		String s39 = String.valueOf('a');
		String s40 = String.valueOf(100);
		String s41 = String.valueOf(100L);
		String s42 = String.valueOf(10f);
		String s43 = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String s44 = String.valueOf(dd);
		System.out.println(s38);
		System.out.println(s39);
		System.out.println(s40);
		System.out.println(s41);
		System.out.println(s42);
		System.out.println(s43);
		System.out.println(s44);
		
		
		
		

	}

}
