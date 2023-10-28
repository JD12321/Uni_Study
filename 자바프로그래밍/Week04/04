"""
4.
"""
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
