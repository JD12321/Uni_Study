"""
1.
"""	
package homework;

import java.util.*;

public class TwoDice {
	public static void main(String[] args) {
		
		Random r1 = new Random();
		int x1 = r1.nextInt(6) + 1;
		System.out.println("주사위1: " + x1);
		
		Random r2 = new Random();
		int x2 = r2.nextInt(6) + 1;
		System.out.println("주사위2: " + x2);
		
		
	}

}
