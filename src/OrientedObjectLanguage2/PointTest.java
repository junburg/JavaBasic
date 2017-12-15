package OrientedObjectLanguage2;


public class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
	}

}

class Point2 {
	int x, y;
	
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Point2 {
	int z;
	
	Point3D(int x,int y, int z) {
		// 생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 'super();' 를 여기에 삽입한다. 
		// super()는 Point3D의 조상인 Point 클래스의 기본 생성자인 Point()를 의미한다.
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
		return "x: " + x +", y: " + y + ", z: " + z;
	}
}