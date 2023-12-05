package dec5th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		
		Set<String> hs=new HashSet<String>();
		
		//List<String> hs=new ArrayList<String>();
		
		System.out.println(hs.size());
		
		 System.out.println(hs.add("Live Tech"));
		
		 System.out.println(hs.add("Selenium"));
		
		 System.out.println(hs.add("Appium"));
		
		 System.out.println(hs.add("TOSCA"));
		
		 System.out.println(hs.add("Live Tech"));
			
		 System.out.println(hs.add("Selenium"));
		
		 System.out.println(hs.add("Appium"));
		
		 System.out.println(hs.add("TOSCA"));
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
