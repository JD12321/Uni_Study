1. '''
package homework01;

public class ch101 {
	public static void main(String[] args) {

		int total = 0;
		for (int i = 0; i < 101; i++) {
			total = total + i;
		}
		System.out.println(total);
	}
}
'''
2. '''
package homework01;

import java.util.*;

public class ch102 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int num1 = r.nextInt(100) + 1;
		int num2, num3;
		
		do {
			num2 = r.nextInt(100) + 1;
		}while(num1==num2);
		
		do {
			num3 = r.nextInt(100) + 1;
		}while (num3==num1||num3==num2);
		
		System.out.printf("1번: %d, 2번: %d, 3번: %d", num1, num2, num3);
		
	}
}
'''
3. '''
package homework01;

import java.util.*;

public class ch103 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int x1 = r.nextInt(45) + 1;
		int x2, x3, x4, x5, x6;
		
		do {
			x2 = r.nextInt(45) + 1;
		}while(x1==x2);
		
		do {
			x3 = r.nextInt(45) + 1;
		}while (x1==x3||x2==x3);
		
		do {
			x4 = r.nextInt(45) + 1;
		}while (x1==x4||x2==x4||x3==x4);
		
		do {
			x5 = r.nextInt(45) + 1;
		}while (x1==x5||x2==x5||x3==x5||x4==x5);
		
		do {
			x6 = r.nextInt(45) + 1;
		}while (x1==x6||x2==x6||x3==x6||x4==x6||x5==x6);
		
		System.out.printf("로또 번호: %d %d %d %d %d %d", x1, x2, x3, x4, x5, x6);
		
	}
}
'''
4. '''
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
'''
5. '''
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
'''
6. '''
package homework04;

import java.util.*;

public class ch401 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("== 좀비게임 시작 ==");

		int pl = 1;
		int jb1 = 7, jb2 = 15;
		do {
			System.out.print("왼쪽(1), 오른쪽(2), 점프(3|오른쪽으로 1~3 이동)\n" + "움직임을 선택하세요 >> ");
			int mc = s.nextInt();

			int l = -1;
			int r = 1;

			if ((mc < 1) || (mc > 3))
				System.out.println("\n잘못 입력하셨습니다.\n");

			else {

				if (mc == 1) {
					pl = pl + l;
					System.out.println("왼쪽으로 이동");
				} else if (mc == 2) {
					pl = pl + r;
					System.out.println("오른쪽으로 이동");
				} else if (mc == 3) {
					int j = rd.nextInt(3) + 1;
					pl = pl + j;
					System.out.println("점프");
				}

				int jbm1 = rd.nextInt(3) - 1;
				jb1 += jbm1;

				int jbm2 = rd.nextInt(3) - 1;
				jb2 += jbm2;

				if (pl < 1)
					pl = 1;
				if (jb1 < 1)
					jb1 = 1;
				else if (jb1 > 20)
					jb1 = 20;
				if (jb2 < 1)
					jb2 = 1;
				else if (jb2 > 20)
					jb2 = 20;

				if (jb1 == pl || jb2 == pl) {
					System.out.println("\n좀비에게 잡혔습니다. 처음위치에서 다시 시작합니다.");
					pl = 1;
				} else if (pl > 19) {
					System.out.println("\n미션 클리어!!! 목적지에 도착했습니다.");
					break;
				}
				System.out.printf("\n위치|나: %d, 좀비1: %d, 좀비2: %d\n", pl, jb1, jb2);
			}
		} while (true);
		s.close();
	}
}
'''
