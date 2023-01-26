package Day06.sec01;


import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		//List<Board> list = new ArrayList<>();
		
		Thread threadA = new Thread() {
			
			@Override
			public void run() {
				for(int i = 1; i<=1000; i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		Thread threadB = new Thread() {
			
			@Override
			public void run() {
				for(int i = 1001; i<=2000; i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();			
		} catch(Exception e) {
			
		}
		int size = list.size();
		System.out.println(size);
		}

}
