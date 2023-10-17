"""
4.
"""
package homework02;

import java.util.*;

public class ch201 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("== 컴퓨터와 가위바위보 시작 ==");

		int me = 0, cm = 0, uc;

		do {
			System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요\n" + "중간에 그만하고 싶다면 중지(4)로 멈추세요. >> ");
			uc = s.nextInt();

			if ((uc < 1) || (uc > 4)) {
				System.out.println("\n잘못 입력하셨습니다.\n");
				continue;
			}

			if (uc == 4) {
				System.out.println("== GAME STOP ==");
				break;
			}

			int cc = r.nextInt(3) + 1;

			if ((uc == 1) && (cc == 2)) {
				cm++;
				System.out.println("나: 가위, 컴퓨터: 바위| 컴퓨터가 이겼습니다.\n" + "나 " + me + "승 | " + "컴퓨터 " + cm + "승\n");
			} else if ((uc == 2) && (cc == 3)) {
				cm++;
				System.out.println("나: 바위, 컴퓨터: 보| 컴퓨터가 이겼습니다.\n" + "나 " + me + "승 | " + "컴퓨터 " + cm + "승\n");
			} else if ((uc == 3) && (cc == 1)) {
				cm++;
				System.out.println("나: 보, 컴퓨터: 가위| 컴퓨터가 이겼습니다.\n" + "나 " + me + "승 | " + "컴퓨터 " + cm + "승\n");
			} else if ((uc == 2) && (cc == 1)) {
				me++;
				System.out.println("나: 바위, 컴퓨터: 가위| 내가 이겼습니다.\n" + "나 " + me + "승 | " + "컴퓨터 " + cm + "승\n");
			} else if ((uc == 3) && (cc == 2)) {
				me++;
				System.out.println("나: 보, 컴퓨터: 바위| 내가 이겼습니다.\n" + "나 " + me + "승 | " + "컴퓨터 " + cm + "승\n");
			} else if ((uc == 1) && (cc == 3)) {
				me++;
				System.out.println("나: 가위, 컴퓨터: 보| 내가 이겼습니다.\n" + "나 " + me + "승 | " + "컴퓨터 " + cm + "승\n");
			} else {
				System.out.println("\n비겼습니다.\n");
			}

			if (me == 3) {
				System.out.println("\n== 끝 ==\n내가 이겼습니다.");
				break;
			} else if (cm == 3) {
				System.out.println("\n== 끝 ==\n컴퓨터가 이겼습니다.");
				break;
			}

		} while (true);

		s.close();
	}
}
