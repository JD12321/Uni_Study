package zomb;

import java.util.Scanner;

public class ZombieGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Zombie zom1 = new Zombie("좀비1", 7);
		Zombie zom2 = new Zombie("좀비2", 15);
		Hero hero = new Hero("은지담", 1, 3);
		
		while(true) {
			System.out.println("왼쪽(1), 오른쪽(2), 점프(3)");
			int input = s.nextInt();
			if(input==1) hero.leftMove();
			else if(input==2) hero.rightMove();
			else if(input==3) hero.jump();
			
			zom1.move();
			zom2.move();
			
			if(hero.pos == zom1.pos || hero.pos == zom2.pos) {
				hero.life--;
			}
			if(hero.pos >= 20) {
				break;
			}
			s.close();
		}
		
	}
}
