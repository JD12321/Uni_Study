package fighter;

public class Boss extends Character {

	public Boss(String name, int hp, int max) {
		super(name, hp, max);
	}

	public int psg() {
		hp -= 10;
		System.out.println("보스 피살기 사용");
		System.out.println(name + "의 현재 hp는 " + hp + "입니다.");
		return max;
	}

	public int Battack() {
		return attack(max);
	}
}
