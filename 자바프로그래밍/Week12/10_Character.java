package fighter;

import java.util.*;

public class Character {

	// 멤버변수
	Random r = new Random();
	String name;
	private int hp;
	int max;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 생성자 - 클래스 이름과 같아야함
	public Character(String n, int h, int m) {
		name = n;
		hp = h;
		max = m;
	}

	public int attack(int m) {
		int power = r.nextInt(m) + 1;
		return power;
	}

	public boolean attack(Character enemy) {
		enemy.hp = enemy.hp - (r.nextInt(max) + 1);
		System.out.println(name + "의 현재 hp는 " + enemy.hp + "입니다.");
		if (enemy.hp <= 0) {
			System.out.println(enemy.name + "이(가) 쓰러졌습니다. 게임을 종료합니다.");
			return false;
		} else
			return true;
	}

}
