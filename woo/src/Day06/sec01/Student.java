package Day06.sec01;

public class Student {
	
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int hashcode() {
		int hashcode = no + name.hashCode();
		return hashcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student target = (Student) obj;
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
		
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

}
