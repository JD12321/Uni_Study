"""
1.
"""
package homework;

import java.util.*;


public class MyProfile02 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("이름 >> ");
		String name = s1.next();

		
		System.out.print("나이 >> ");
		int age = s1.nextInt();

		
		System.out.print("생년월일 8자리 >> ");
		long btday = s1.nextLong();

		
		System.out.print("키 >> ");
		double height = s1.nextDouble();

		
		System.out.print("취미 >> ");
		String hobby = s1.next();
		
		s1.close(); // scanner 마무리로 close 꼭 하기
		
		System.out.println("당신의 입력한 내용은\n이름: " + name + ",\n" +
				"나이: " + age + ",\n" + "생년월일: " + btday + ",\n" +
				"키: " + height + ",\n" + "취미: " + hobby + " 입니다.");
		
	}
}
