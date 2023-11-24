package fighter;

public class Boss extends Character {

	public Boss(String n, int h, int m) {
		super(n, h, m);
	}

	public boolean attack(Character enemy) {
		enemy.setHp(enemy.getHp() - (r.nextInt(max) + 1));
		System.out.println(enemy.name + "의 현재 hp는 " + enemy.getHp() + "입니다.");
		if (enemy.getHp() <= 0) {
			System.out.println(enemy.name + " 쓰러졌습니다. 게임을 종료합니다.");
			return false;
		} else
			return true;

	}
}
