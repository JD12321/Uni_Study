package exam;

public abstract class Unit {
	
	private int pos;
	private int hp;
	int max;
	
	public Unit(int pos, int hp, int max) {
		this.pos = pos;
		this.hp = hp;
		this.max = max;
	}
	
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void move() {
		if(pos <= 10) pos++;
		System.out.println("현재의 위치는 " + pos + "입니다.");
	}
	
	// 추상 메소드 선언
	public abstract void attack(Unit enemy);
	
}
