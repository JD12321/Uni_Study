package zombie;

import java.util.*;

public abstract class Unit {
	Random r = new Random();
	String name;
	int pos;

	public Unit(String name, int pos) {
		this.name = name;
		this.pos = pos;
	}

	public void left() {
		pos -= 1;
		if (pos <= 0)
			pos = 1;
		System.out.println(name + "이(가) 왼쪽으로 움직여서 현재 위치는 " + pos + "입니다.");
	}

	public void right() {
		pos += 1;
		if (pos > 20)
			pos = 20;
		System.out.println(name + "이(가) 오른쪽으로 움직여서 현재 위치는 " + pos + "입니다.");
	}
	
	public abstract void move();

}
