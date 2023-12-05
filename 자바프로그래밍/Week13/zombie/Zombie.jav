package zombie;

public class Zombie extends Unit {

	public Zombie(String name, int pos) {
		super(name, pos);
	}

	public void move() {
		int a = r.nextInt(3);

		if (a == 0)
			left();
		else if (a == 1)
			right();
		else
			System.out.println(name + "의 현재 위치는 " + pos + "입니다.");
	}

}
