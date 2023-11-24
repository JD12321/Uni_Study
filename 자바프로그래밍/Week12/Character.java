package fighter;

import java.util.Random;

public class Character {
	
	Random r = new Random();
	String name;
	private int hp;
	int max;
	
	public Character(String n, int h, int m) {
		name = n;
		hp = h;
		max = m;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public boolean attack(Character enemy) {
		
		if(enemy instanceof Boss) {
			Boss b = (Boss)enemy; //다운캐스팅
			b.setHp(b.getHp() - (r.nextInt(max) + 1));
		} else if (enemy instanceof Character) {
			Character c = (Character)enemy;
			c.setHp(c.getHp() - (r.nextInt(max) + 1));
		}
		
		System.out.println(enemy.name+"의 현재 hp는 " + enemy.getHp() + "입니다.");
		if (enemy.hp<=0) {
			System.out.println(enemy.name + " 쓰러졌습니다. 게임을 종료합니다.");
			return false;
		} else return true;
	}
	
}
