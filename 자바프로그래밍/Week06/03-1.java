"""
3-1.
"""
package homework;

import java.util.*;

public class ch03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("== 좀비게임 시작 ==");
		
		int pl = 1;
		int zbs[] = { 7, 15 };

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

				for (int i = 0; i < zbs.length; i++) {
					int zbm = rd.nextInt(3) - 1;
					zbs[i] += zbm;
				}

				if (pl < 1)
					pl = 1;
				for (int i = 0; i < zbs.length; i++) {
					if (zbs[i] < 1)
						zbs[i] = 1;
					else if (zbs[i] > 20)
						zbs[i] = 20;
				}
				for (int i = 0; i < zbs.length; i++) {
					if (zbs[i] == pl) {
						System.out.println("\n좀비에게 잡혔습니다. 처음위치에서 다시 시작합니다.");
						pl = 1;
					}
				}

				System.out.printf("\n위치|나: %d", pl);
				for (int i = 0; i < zbs.length; i++) {
					System.out.printf(", 좀비%d: %d", i, zbs[i]);
				}
				System.out.println();

				if (pl > 19) {
					System.out.println("\n미션 클리어!!! 목적지에 도착했습니다.");
					break;
				}
			}
		} while (true);
		s.close();
	}
}
