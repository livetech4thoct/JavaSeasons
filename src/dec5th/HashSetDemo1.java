package dec5th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		
		Set<String> hs=new HashSet<String>();
		
		//List<String> hs=new ArrayList<String>();
		
		System.out.println(hs.size());
		
		hs.add("Live Tech");
		
		hs.add("Selenium");
		
		hs.add("Appium");
		
		hs.add("TOSCA");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		Iterator<String> it=hs.iterator();
		
		System.out.println(it.next());
		
		System.out.println(it.next());
		
		System.out.println(it.next());
		
		System.out.println(it.next());
		
		

	}

}
