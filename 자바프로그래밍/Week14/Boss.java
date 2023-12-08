package exam;

import java.util.Random;

public class Boss extends Zombie {
	Random r = new Random();
	
	int shield;
	
	public Boss(int pos, int hp, int max, int shield) {
		super(pos, hp, max);
		this.shield = shield;
	}
	
	public void attack(Unit enemy) {
		int power = r.nextInt(max) + 1;
		int n = r.nextInt(4);
		
		if (n==0) { // 필살 공격
			enemy.setHp(enemy.getHp() - power * 2);
			System.out.println("보스가 " + power + "의 공격력으로 필살기 공격: 현재 Hero의  hp"
					+ enemy.getHp());
		} else {// 일반 공격
			enemy.setHp(enemy.getHp() - power);
			System.out.println("보스가 " + power + "의 공격력으로 일반 공격: 현재 Hero의  hp"
					+ enemy.getHp());
		}
	}
	
}
