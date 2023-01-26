package Day06.sec01;

public class RecordEx {

	public static void main(String[] args) {
		
		Person p = new Person("Killagram", "민경석", 19);
		System.out.println(p.id());
		System.out.println(p.name());
		System.out.println(p.age());
		System.out.println(p.toString());
		
		Person p1 = new Person("Killagram", "민경석", 19);
		Person p2 = new Person("Anime", "박재현", 45);
		System.out.println(p1.hashCode());
		System.out.println(p.equals(p1));
		System.out.println(p1.equals(p2));

	}

}
