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



"""
2-1.
"""
package homework;

import java.util.*;

public class ch02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("입력할 학생 수를 입력하세요 >> ");
		int num = s.nextInt();
		System.out.println();

		int korean[] = new int[num]; // 국어 성적
		int english[] = new int[num]; // 영어 성적
		int math[] = new int[num]; // 수학 성적
		int sum[] = new int[num]; // 총점
		double avg[] = new double[num];

		for (int i = 0; i < num; i++) {
			System.out.print("국어, 영어, 수학 성적을 입력하세요 >> ");
			korean[i] = s.nextInt();
			english[i] = s.nextInt();
			math[i] = s.nextInt();
			sum[i] = korean[i] + english[i] + math[i];
			avg[i] = sum[i] / 3.0;
		}
		s.close();
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "번 학생의 성적 평균은: " + avg[i]);
		}
	}
}



"""
2-2.
"""
package homework;

import java.util.*;

public class ch02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("입력할 학생 수를 입력하세요 >> ");
		int num = s.nextInt();
		System.out.println();

		int data[][] = new int[num][4];

		for (int i = 0; i < num; i++) {
			System.out.print("국어, 영어, 수학 성적을 입력하세요 >> ");
			for (int j = 0; j < 3; j++) {
				data[i][j] = s.nextInt();
			}
			data[i][3] = data[i][0] + data[i][1] + data[i][2];

		}

		int korean[] = new int[num]; // 국어 성적
		int english[] = new int[num]; // 영어 성적
		int math[] = new int[num]; // 수학 성적
		int sum[] = new int[num]; // 총점
		double avg[] = new double[num];

		for (int i = 0; i < num; i++) {
			System.out.print("국어, 영어, 수학 성적을 입력하세요 >> ");
			korean[i] = s.nextInt();
			english[i] = s.nextInt();
			math[i] = s.nextInt();
			sum[i] = korean[i] + english[i] + math[i];
			avg[i] = sum[i] / 3.0;
		}
		s.close();
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "번 학생의 성적 평균은: " + avg[i]);
		}
	}
}



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



"""
3-2.
"""
package homework;

import java.util.*;

public class ch03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("== 좀비게임 시작 ==");

		int map[] = new int[20];

		int pl = 1;
		int zbs[] = { 7, 15 };

		do {
			for (int i = 0; i < map.length; i++)
				map[i] = 0;
			map[pl - 1] = 1;
			for (int z : zbs)
				map[z - 1] = 2;

			for (int i = 0; i < map.length; i++)
				System.out.print(map[i]);
			System.out.println();

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
					System.out.printf(", 좀비%d: %d", i + 1, zbs[i]);
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
