1. '''
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
'''

2. '''
package homework;

import java.util.*;

public class ch02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("== 369 게임 시작 ==");

		System.out.print("1~99 사이의 정수를 입력하세요 >> ");
		int tsn = s.nextInt();
		s.close();
		if ((tsn < 1) || (tsn > 99))
			System.out.println("잘못 입력하셨습니다.");

		else {
			int a = tsn / 10;
			int b = tsn % 10;
			int count = 0;

			if ((a == 3) || (a == 6) || (a == 9))
				count++;
			if ((b == 3) || (b == 6) || (b == 9))
				count++;

			if (count == 2)
				System.out.println("박수짝짝");
			else if (count == 1)
				System.out.println("박수짝");
			else
				System.out.println(tsn);
		}
	}

}
'''

3. '''
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
'''

4. '''
package homework;

import java.util.*;

public class ch04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("== 좀비게임 시작 ==");

		int pl = 1;

		System.out.print("왼쪽(1), 오른쪽(2), 점프(3|오른쪽으로 1~3 이동)\n" + "움직임을 선택하세요 >> ");
		int mc = s.nextInt();
		s.close();

		int l = -1;
		int r = 1;

		if ((mc < 1) || (mc > 3))
			System.out.println("잘못 입력하셨습니다.");

		else {
			if (mc == 1) {
				pl = pl + l;
				System.out.println("왼쪽으로 이동|현재 위치 " + pl);
			} else if (mc == 2) {
				pl = pl + r;
				System.out.println("오른쪽으로 이동|현재 위치 " + pl);
			} else if (mc == 3) {
				int j = rd.nextInt(3) + 1;
				pl = pl + j;
				System.out.println("점프|현재 위치 " + pl);
			}
		}

	}
}
'''

5. '''
package homework;

import java.util.*;

public class ch05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random w = new Random();
		Random j = new Random();

		System.out.println("== 격투 게임 시작 ==");

		System.out.print("공격을 하려면 1을 누르세요 >> ");
		int as = s.nextInt();
		s.close();

		int mh = 10;
		int jh = 20;

		if (as != 1)
			System.out.println("종료합니다.");

		else {
			int ma = w.nextInt(11) + 15;
			jh = jh - ma;

			int ja = j.nextInt(11) + 5;
			mh = mh - ja;

			System.out.println("마법사 HP: " + mh + ", 전사 HP: " + jh);

			if ((mh <= 0) && (jh <= 0))
				System.out.println("마법사와 전사가 동시에 죽었습니다.");
			else if (jh <= 0)
				System.out.println("전사가 죽었습니다.");
			else if (mh <= 0)
				System.out.println("마법사가 죽었습니다.");

		}

	}
}
'''
