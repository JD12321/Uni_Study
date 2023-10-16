"""
3.
"""
package homework;

import java.util.*;

public class MyProfile04 {
	public static void main(String[] args) {
		Scanner s4 = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 >> ");
		double x1 = s4.nextDouble();
		
		System.out.print("두번째 숫자를 입력하세요 >> ");
		double x2 = s4.nextDouble();
		
		s4.close();
		
		System.out.println(x1 + " x " + x2 + "의 결과는 "
				+ (x1 * x2) + "입니다.");
		
		
	}

}
