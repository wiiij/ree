package Day06.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java");
		set.add("Jsp");
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		set.remove("JDBC");
		
		for(String e : set) {
			System.out.println(e);
		}

	}

}
