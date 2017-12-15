package IfSwitchForWhileStatement;

public class FlowEx24 {

	public static void main(String[] args) {
		int i=11;
		
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");
		
		while(i--!= 0) {
			System.out.println(i);
			
			for(long k=0; k<2_000_000_000; k++) { ; }
		}
		System.out.println("GAME_OVER");
	}

}
