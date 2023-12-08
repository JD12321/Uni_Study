package exam;

import java.util.Random;

public class Hero extends Unit {
	Random r = new Random();
	
	int hp_item;
	
	public Hero(int pos, int hp, int max, int hp_item) {
		super(pos, hp, max);
		this.hp_item = hp_item;
	}
	
	public void attack(Unit enemy) {
		int power = r.nextInt(max) + 1;
		
		if(enemy instanceof Boss) {
			Boss b = (Boss)enemy;
			
			if(b.shield > 0) {
				b.shield -= power;
				System.out.println("Hero가 " + power + "의 공격력으로 보스를 공격, 현재 적의 shield"
						+ b.shield + ", hp " + b.getHp());
			} else {	
				b.setHp(b.getHp() - power);
				System.out.println("Hero가 " + power + "의 공격력으로 보스를 공격: 현재 적의 hp "
						+ b.getHp());
			}
			
		} else if (enemy instanceof Zombie) {
			Zombie z = (Zombie)enemy;
			z.setHp(z.getHp() - power);
			System.out.println("Hero가 " + power + "의 공격력으로 좀비를 공격: 현재 적의 hp "
					+ z.getHp());
		}
		
	}
	
	public void recovery() {
		if(hp_item > 0) {
			hp_item--;
			this.setHp(this.getHp() + 100);
			System.out.println("체력을 회복해서 " + this.getHp() + "이 되었습니다.");
		} else {
			System.out.println("모두 사용했습니다.");
		}
	}
	
}
