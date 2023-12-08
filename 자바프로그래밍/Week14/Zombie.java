package exam;

import java.util.Random;

public class Zombie extends Unit {
	Random r = new Random();
	
	public Zombie(int pos, int hp, int max) {
		// 부모의 생성자 호출
		super(pos, hp, max);
	}
	
	public void attack(Unit enemy) {
		int power = r.nextInt(max) + 1;	//1-max
		enemy.setHp(enemy.getHp() - power); 
		this.setHp(this.getHp() + power/2);
		
		System.out.println("좀비가 " + power + "의 공격력으로 Hero를 공격: 현재 Hero의  hp"
		+ enemy.getHp() + ", 좀비 체력 회복 hp " + this.getHp());
	}
	
}
