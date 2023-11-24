package fighter;

import java.util.*;

public class Character {
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

	public Character(String name, int hp, int max) {
		this.name = name;
		this.hp = hp;
		this.max = max;
	}

	public int attack(Character enemy) {
		enemy.setHp(enemy.getHp() - r.nextInt(max) + 1);
		return power;
	}

	public int dps(int a) {
		if (a == 1)
			return 0;
		else
			return 1;
	}

}
