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
