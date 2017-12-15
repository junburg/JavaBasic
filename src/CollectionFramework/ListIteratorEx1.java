package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()); // 순방향
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			System.out.println(it.previous()); // 역방향
		}
		System.out.println();

	}

}
