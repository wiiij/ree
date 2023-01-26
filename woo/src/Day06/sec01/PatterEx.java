package Day06.sec01;

import java.util.regex.Pattern;

public class PatterEx {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("전화번호가 유효합니다.");
		} else {
			System.out.println("전화번호가 유효하지 않습니다. 다시 입력하세요.");
		}
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("메일주소가 잘 입력되었습니다.");
		} else {
			System.out.println("메일주소가 정확하지 않습니다. 다시 입력하세요.");
		}

	}

}
