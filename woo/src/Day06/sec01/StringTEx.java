package Day06.sec01;

import java.util.StringTokenizer;

public class StringTEx {

	public static void main(String[] args) {
		String data1 = "민경석,90,80,70";
		String[] arr = data1.split(",");
		for(String token: arr) {
			System.out.println(token);
		}
		
		System.out.println();
		String data2 = "민경석,90,80,70";
		StringTokenizer st = new StringTokenizer(data2, ",");
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
