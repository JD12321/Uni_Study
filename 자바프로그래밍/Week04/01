"""
1.
"""
package homework;

import java.util.*;

public class ch01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("== 홀짝 주사위 게임 시작 ==");

		System.out.print("홀수(0) 또는 짝수(1)를 선택하세요 >> ");
		int ch = s.nextInt();
		s.close();
		if ((ch < 0) || (ch > 1))
			System.out.println("잘못 입력하셨습니다.");

		else {
			System.out.println("주사위를 던집니다.");
			int dc = r.nextInt(6) + 1;
			System.out.print("나온 숫자는 " + dc + "입니다. ");

			if (dc % 2 == 0) {
				dc = 1;
				System.out.println("짝수입니다.");
			} else {
				dc = 0;
				System.out.println("홀수입니다.");
			}

			if (ch == dc)
				System.out.println("사용자가 이겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
		}

	}
}
