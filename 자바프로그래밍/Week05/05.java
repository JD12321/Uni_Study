"""
5.
"""
package homework03;

import java.util.*;

public class ch301 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random w = new Random();
		Random j = new Random();

		System.out.println("== 격투 게임 시작 ==");

		int mh = 10;
		int jh = 20;
		int as;

		do {
			System.out.print("공격을 하려면 1을 누르세요 >> ");
			as = s.nextInt();

			if (as != 1) {
				System.out.println("종료합니다.");
				break;
			}

			int ma = w.nextInt(11) + 15;
			jh = jh - ma;

			int ja = j.nextInt(11) + 5;
			mh = mh - ja;

			System.out.println("마법사 HP: " + mh + ", 전사 HP: " + jh);

			if ((mh <= 0) && (jh <= 0)) {
				System.out.println("마법사와 전사가 동시에 죽었습니다.");
				break;
			} else if (jh <= 0) {
				System.out.println("전사가 죽었습니다.");
				break;
			} else if (mh <= 0) {
				System.out.println("마법사가 죽었습니다.");
				break;
			}

		} while (true);

		s.close();
	}
}
