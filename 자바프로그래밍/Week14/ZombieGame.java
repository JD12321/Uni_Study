package exam;

import java.util.Scanner;

public class ZombieGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Zombie z = new Zombie(5, 100, 10);
		Boss b = new Boss(9, 300, 20, 100);
		Hero h = new Hero(1, 200, 20, 2);
		
		while(true) {
			System.out.println("1번-이동(앞으로), 2번-종료");
			int input = s.nextInt();
			if(input==1) {
				h.move();
				if(h.getPos()==z.getPos()) {
					System.out.println("좀비를 만났습니다. 공격모드입니다.");
					while(true) {
						System.out.println("1번-공격, 2번-체력회복");
						int ab = s.nextInt();
						if(ab==1) h.attack(z);
						else if(ab==2) h.recovery();
						// 좀비 공격
						z.attack(h);
						
						if(z.getHp()<=0) {
							System.out.println("좀비를 죽였습니다. 이동할 수 있습니다.");
							break;
						} else if(h.getHp()<=0) {
							System.out.println("Hero가 죽었습니다. 게임에서 졌습니다.");
							return;
						}
					}
				}else if(h.getPos()==b.getPos()) {
					System.out.println("보스를 만났습니다. 공격모드입니다.");
					while(true) {
						System.out.println("1번-공격, 2번-체력회복");
						int ab = s.nextInt();
						if(ab==1) h.attack(b);
						else if(ab==2) h.recovery();
						// 보스 공격
						b.attack(h);
						
						if(b.getHp()<=0) {
							System.out.println("보스를 죽였습니다. 이동할 수 있습니다.");
							break;
						} else if(h.getHp()<=0) {
							System.out.println("Hero가 죽었습니다. 게임에서 졌습니다.");
							return;
						}
					}
				}else if(h.getPos()==10) {
					System.out.println("게임에서 승리했습니다. 종료합니다.");
					break;
				}
			}else if(input==2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}
		
	}
}
