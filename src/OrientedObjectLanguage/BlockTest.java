package OrientedObjectLanguage;

class BlockTest {
	static { // 클래스가 메모리에 올라갈 때 한번만 실행됨  
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자 ");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
	}

}
