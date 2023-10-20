"""
01.
"""
package study;

import java.util.*;

public class ch01 {
	public static void main(String[] args) {
		int map[][] = {{0,0,1,1,1},
					   {1,0,0,1,1},
					   {1,1,0,0,1},
					   {1,1,1,0,1},
					   {1,1,1,0,0}};
		
		int x=0, y=0;
		int count = 0;	 //횟수 저장
		Scanner s = new Scanner(System.in);
		
		while(true) {
			map[y][x] = 8; //주인공 위치
			//현재 맵 상황을 화면에 출력
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			
			map[y][x] = 0;
			
			System.out.print("상(1), 하(2), 좌(3), 우(4)를 입력하세요 >> ");
			int input = s.nextInt();
			if(input==1) {
				if (y > 0)
					y = y - 1;
				else
					System.out.println("맵 밖으로 이동 불가");
				
				if (map[y][x] == 1) {
					System.out.println("벽에 막힘");
					y = y + 1;
				}
				count++;
			} else if (input == 2) {
				if (y < 5)
					y = y + 1;
				else
					System.out.println("맵 밖으로 이동 불가");
				
				if (map[y][x] == 1) {
					System.out.println("벽에 막힘");
					y = y - 1;
				}
				count++;
			} else if (input == 3) {
				if (x > 0)
					x = x - 1;
				else
					System.out.println("맵 밖으로 이동 불가");
				
				if (map[y][x] == 1) {
					System.out.println("벽에 막힘");
					x = x + 1;
				}
				count++;
			} else if (input == 4) {
				if (x < 5)
					x = x + 1;
				else
					System.out.println("맵 밖으로 이동 불가");
				
				if (map[y][x] == 1) {
					System.out.println("벽에 막힘");
					x = x - 1;
				}
				count++;
			} else
				System.out.println("입력 오류");
			
			if (x==4 && y==4) {
				System.out.println("목적지에 도착했습니다.");
				System.out.println("총 " + count + "번 만에 목적지에 도착했습니다.");
				break;
			}
			
		}
		
	}
}
