package Day06.sec01;

public class HashcodeEx {

	public static void main(String[] args) {
		
		Student s1 =  new Student(1, "홍길동");
		Student s2 =  new Student(1, "홍길동");
		Student s3 =  new Student(12, "박재현");
		
		if(s1.hashcode() == s2.hashcode()) {
			if(s1.equals(s2)) {
				System.out.println("동등객체");
			} else {
				System.out.println("데이터가 다르므로 동등객체가 아님");
			}
		} else {
			System.out.println("해시코드가 다르므로 동드객체가 아님");
		}
		

	}

}
