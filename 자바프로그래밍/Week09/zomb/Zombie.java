package zomb;

import java.util.Random;

public class Zombie {
	Random r = new Random();
	String name;
	int pos;
	
	public Zombie(String n, int p) {
		name = n;
		pos = p;
	}
	
	public void move() {
		pos += r.nextInt(3)-1;
		System.out.println(name+"의 현재위치는 "+pos+"입니다.");
	}
}
