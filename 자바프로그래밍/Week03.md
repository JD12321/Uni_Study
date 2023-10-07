1. '''
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
'''

2. '''
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
'''

3. '''
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
'''

4. '''
package homework;

import java.util.*;

public class MyProfile05 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        System.out.print("1~6 사이의 숫자를 하나 입력하세요 >> ");
        int x1 = s.nextInt();
                
        while (x1 <= 0 || x1 > 6) {
        	System.out.print("1~6 사이의 숫자를 입력하세요 >> ");
        	x1 = s.nextInt();
        }
        
        s.close();
        
        int d = r.nextInt(6) + 1;
        System.out.println("주사위: " + d);
        
        if (x1 == d) {
            System.out.println("주사위 숫자를 맞췄습니다.");
        }
        else {
            System.out.println("주사위 숫자가 다릅니다.");
        }
    }
}
'''
