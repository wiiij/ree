package Day06.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class LinkedListEx {

	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%s %d ns \n","ArrayList 걸린시간: ",(endTime-startTime));
		
		
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%s %d ns \n","LinkedList 걸린시간: ",(endTime-startTime));
		

	}

}
