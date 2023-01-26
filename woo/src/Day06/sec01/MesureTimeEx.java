package Day06.sec01;

public class MesureTimeEx {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		int sum = 0;
		for(int i = 11; i<=1000000; i ++) {
			sum += 1;
		}
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 걸린 시간: " + (time2-time1)+"나노초");

	}

}
