"""
1.
"""
package homework;

import java.util.*;

public class ch01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int map[] = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int pos = 0; // 주인공의 위치, 배열인덱스

		while (true) {
			for (int i = 0; i < map.length; i++) {
				System.out.print(map[i]);
			}
			System.out.println();

			System.out.print("왼쪽(1), 오른쪽(2) >> ");
			int input = s.nextInt();

			if (input == 1) {
				map[pos] = 0;
				pos--;
				if (pos < 0) {
					pos = 0;
					System.out.println("맵 밖으로 나갈 수 없음");
				} else {
					map[pos] = 1;
				}
			} else if (input == 2) {
				map[pos] = 0;
				pos++;
				map[pos] = 1;
			} else
				System.out.println("입력 오류");

			if (pos == 19) {
				System.out.println("목적지에 도착했습니다.");
				break;
			}
		}
		s.close();
	}
}
