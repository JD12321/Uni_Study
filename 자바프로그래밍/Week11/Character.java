package fighter;

import java.util.*;

public class Character {
	Random r = new Random();

	String name;
	int hp;
	int max;

	public Character(String name, int hp, int max) {
		this.name = name;
		this.hp = hp;
		this.max = max;
	}

	public int attack(int m) {
		int power = r.nextInt(m) + 1;
		return power;
	}

	public int dps(int a) {
		if (a == 1)
			return 0;
		else
			return 1;
	}

}
