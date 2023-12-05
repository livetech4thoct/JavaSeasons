package dec5th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
			List<Integer> al=new ArrayList<Integer>();
			
			al.add(100);
			
			al.add(200);
			
			al.add(300);
			
			al.add(400);
			
			al.add(500);
			
			System.out.println(al.size());
			
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}

	}

}
