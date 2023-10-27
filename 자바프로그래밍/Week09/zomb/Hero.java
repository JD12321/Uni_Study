package zomb;

import java.util.Random;

public class Hero {
	Random r = new Random();
	String name;
	int pos;
	int life;
	
	public Hero(String n, int p, int l) {
		name = n;
		pos = p;
		life = l;
	}
	
	public void leftMove() {
		pos -= 1;
		System.out.println(name+"이(가) 왼쪽으로 이동하여 현재위치는"+pos+"입니다.");
	}
	
	public void rightMove() {
		pos += 1;
		System.out.println(name+"이(가) 오른쪽으로 이동하여 현재위치는"+pos+"입니다.");
	}
	
	public void jump() {
		int a = r.nextInt(3)+1;
		pos += a;
		System.out.println(name+"이(가) "+a+"만큼 점프 했습니다.\n현재위치는"+pos+"입니다.");
	}
	
}
