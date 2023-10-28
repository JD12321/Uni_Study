"""
3.
"""
package homework;

import java.util.*;

public class ch03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("== 컴퓨터와 가위바위보 시작 ==");

		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >> ");
		int uc = s.nextInt();
		s.close();
		if ((uc < 1) || (uc > 3))
			System.out.println("잘못 입력하셨습니다.");

		else {
			int cc = r.nextInt(3) + 1;

			if ((uc == 1) && (cc == 2))
				System.out.println("나: 가위, 컴퓨터: 바위, 컴퓨터가 이겼습니다.");

			else if ((uc == 2) && (cc == 3))
				System.out.println("나: 바위, 컴퓨터: 보, 컴퓨터가 이겼습니다.");

			else if ((uc == 3) && (cc == 1))
				System.out.println("나: 보, 컴퓨터: 가위, 컴퓨터가 이겼습니다.");

			else if ((uc == 2) && (cc == 1))
				System.out.println("나: 바위, 컴퓨터: 가위, 내가 이겼습니다.");

			else if ((uc == 3) && (cc == 2))
				System.out.println("나: 보, 컴퓨터: 바위, 내가 이겼습니다.");

			else if ((uc == 1) && (cc == 3))
				System.out.println("나: 가위, 컴퓨터: 보, 내가 이겼습니다.");

			else
				System.out.println("비겼습니다.");
		}
	}
}
