"""
02.
"""
package exam;

import java.util.*;

public class ex01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("== 축구게임을 시작합니다 ==");

		int count = 11;
		int me = 0, cpt = 0;

		while (true) {
			if (count % 2 == 0) {
				System.out.println("\n" + count + "번째" + " 내가 공을 막을 차례입니다.(골키퍼)\n" + "어느쪽으로 막겠습니까?");
				System.out.print("왼쪽(1), 가운데(2), 오른쪽(3), 게임 끝(4) >> ");
				int gkp = s.nextInt();

				int st = r.nextInt(3) + 1;

				if (gkp == 1) {
					System.out.println("왼쪽으로 움직입니다.");
				} else if (gkp == 2) {
					System.out.println("가운데로 움직입니다.");
				} else if (gkp == 3) {
					System.out.println("오른쪽으로 움직입니다.");
				} else if (gkp == 4) {
					System.out.println("게임 종료");
					break;
				} else
					System.out.println("입력 오류");

				if (st == 1)
					System.out.println("킥커가 왼쪽으로 공을 찼습니다.");
				else if (st == 2)
					System.out.println("킥커가 가운데로 공을 찼습니다.");
				else if (st == 3)
					System.out.println("킥커가 오른쪽으로 찼습니다.");

				if (gkp < 4 && gkp > 0)
					if (gkp != st) {
						System.out.println("아깝습니다. 골을 먹었습니다.");
						cpt++;
						count++;
					} else {
						System.out.println("공을 막았습니다.");
						count++;
					}
			} else {
				System.out.println("\n" + count + "번째" + " 내가 공을 찹니다.(킥커)\n" + "어느쪽으로 차겠습니까?");
				System.out.print("왼쪽(1), 가운데(2), 오른쪽(3), 게임 끝(4) >> ");
				int st = s.nextInt();

				int gkp = r.nextInt(3) + 1;

				if (st == 1) {
					System.out.println("왼쪽으로 공을 찼습니다.");
				} else if (st == 2) {
					System.out.println("가운데로 공을 찼습니다.");
				} else if (st == 3) {
					System.out.println("오른쪽으로 공을 찼습니다.");
				} else if (st == 4) {
					System.out.println("게임 종료");
					break;
				} else
					System.out.println("입력 오류");

				if (gkp == 1)
					System.out.println("골키퍼가 왼쪽으로 움직입니다.");
				else if (gkp == 2)
					System.out.println("골키퍼가 가운데로 움직입니다.");
				else if (gkp == 3)
					System.out.println("골키퍼가 오른쪽으로 움직입니다.");

				if (st < 4 && st > 0)
					if (st != gkp) {
						System.out.println("골인입니다.");
						me++;
						count++;
					} else {
						System.out.println("아깝습니다. 골키퍼가 골을 막았습니다.");
						count++;
					}
			}
			if (count == 11) {
				if (me > cpt) {
					System.out.println("\n나는 " + me + "골," + "컴퓨터는 " + cpt + "골을 넣어 내가 이겼습니다.");
					break;
				} else if (cpt > me) {
					System.out.println("\n나는 " + me + "골," + "컴퓨터는 " + cpt + "골을 넣어 컴퓨터가 이겼습니다.");
					break;
				}
			} else if (count > 10 && cpt == me) {
				if (count % 2 != 0) {
					System.out.println("동점입니다. 1번씩 더 공을 차서 승부를 결정합니다.");
					if (me > cpt) {
						System.out.println("\n나는 " + me + "골," + "컴퓨터는 " + cpt + "골을 넣어 내가 이겼습니다.");
						break;
					} else if (cpt > me) {
						System.out.println("\n나는 " + me + "골," + "컴퓨터는 " + cpt + "골을 넣어 컴퓨터가 이겼습니다.");
						break;
					}
				}
			}
		}
		s.close();
		System.out.println("게임을 종료합니다.");
	}
}
