package Day06.sec01;

public class EqualsEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("두 객체는 동등객체입니다.");
		} else {
			System.out.println("두 객체는 동등객체가 아닙니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("두 객체는 동등객체입니다.");
		} else {
			System.out.println("두 객체는 동등객체가 아닙니다.");
		}

	}

}
