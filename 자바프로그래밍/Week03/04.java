"""
4.
"""
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
