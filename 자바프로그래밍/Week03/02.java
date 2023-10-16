"""
2.
"""
package homework;

import java.util.*;

public class MyProfile03 {
	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위, 원) >> ");
		int won = s2.nextInt();
		
		s2.close(); // scanner 마무리로 close 꼭 하기
		
		double dollar = won / 1100.0; /* 나누기 할 때 실수형 결과 필수여서 
		 								 뒤에 .0 꼭 붙여야 함*/
		System.out.println(won + "원은 $" + dollar + " 입니다.");
		
	}
}
