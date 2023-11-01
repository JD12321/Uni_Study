"""
2.
"""
package homework;

import java.util.*;

public class Wizard {
	public static void main(String[] args) {
		Random r = new Random();
		
		int x = r.nextInt(11) + 20;
		
		System.out.println("마법사가 " + x + "의 공격으로 적을 공격했습니다.");
		
	}

}
