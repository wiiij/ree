package Day06.sec01;

import java.io.IOException;

public class Inex {

	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			keyCode = System.in.read();
			
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {
					speed++;
				} else if(keyCode == 50) {
					speed--;
				}  else if(keyCode == 51) {
					break;
				}
				
				System.out.println("----------------------");
				System.out.println("1.증속 2.감속 3.중지");
				System.out.println("----------------------");
				System.out.println("현재속도 = " + speed);
				System.out.println("선택: ");
			}
			
			keyCode = System.in.read();
		}
	}

}
