"""
2.
"""
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
