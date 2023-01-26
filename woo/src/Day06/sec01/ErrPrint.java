package Day06.sec01;

public class ErrPrint {

	public static void main(String[] args) {
		
		try {
			
			int values = Integer.parseInt("loo");
			
		} catch(NumberFormatException e) {
			System.err.println("[에러내용]");
			System.err.println(e.getMessage());
		}

	}

}
