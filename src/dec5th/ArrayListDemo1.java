package dec5th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		List al = new ArrayList();

		System.out.println(al.size());

		al.add(100);

		al.add(200.33);

		al.add(300);

		al.add(100);

		al.add(200.33);

		al.add(300);

		al.add(100);

		al.add(200.33);

		al.add(300);

		al.add(100);

		al.add(200.33);

		al.add(300);

		System.out.println(al.size());

		System.out.println(al.get(0));

		System.out.println(al.get(1));

		System.out.println(al.get(2));

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println(al.contains(300));

	}

}
