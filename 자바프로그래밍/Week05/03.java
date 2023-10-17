"""
3.
"""
package homework01;

import java.util.*;

public class ch103 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int x1 = r.nextInt(45) + 1;
		int x2, x3, x4, x5, x6;
		
		do {
			x2 = r.nextInt(45) + 1;
		}while(x1==x2);
		
		do {
			x3 = r.nextInt(45) + 1;
		}while (x1==x3||x2==x3);
		
		do {
			x4 = r.nextInt(45) + 1;
		}while (x1==x4||x2==x4||x3==x4);
		
		do {
			x5 = r.nextInt(45) + 1;
		}while (x1==x5||x2==x5||x3==x5||x4==x5);
		
		do {
			x6 = r.nextInt(45) + 1;
		}while (x1==x6||x2==x6||x3==x6||x4==x6||x5==x6);
		
		System.out.printf("로또 번호: %d %d %d %d %d %d", x1, x2, x3, x4, x5, x6);
		
	}
}
