package car;

import java.util.*;

public class CarGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Car car1 = new Car("홍길동", 200, 20);
		int cnt = 0;

		System.out.println("자동차 게임을 시작합니다.");

		while (car1.km < 5000) {
			System.out.println("가속(1), 감속(2), 정지(3), 주행거리 표시(4)");
			int input = s.nextInt();

			if (input == 1) {
				car1.speedUp();
				cnt++;
			}
			else if (input == 2) {
				car1.speedDown();
				cnt++;
			}
			else if (input == 3) {
				car1.stop();
				cnt++;
			}
			else if (input == 4)
				car1.printKm();
		}
		System.out.println(cnt + "번 만에 도착 했습니다.");
		s.close();
	}
}
