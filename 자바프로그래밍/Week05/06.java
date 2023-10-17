"""
6.
"""
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
