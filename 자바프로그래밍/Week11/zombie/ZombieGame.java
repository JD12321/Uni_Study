package zombie;

public class ZombieGame {
	public static void main(String[] args) {
		Hero h = new Hero("Hero", 1, 3);
		Zombie zb1 = new Zombie("zb1", 7);
		Zombie zb2 = new Zombie("zb2", 15);

		while (true) {
			h.move();
			zb1.move();
			zb2.move();

			if (h.pos == 20) {
				System.out.println("미션 클리어!!! 목적지에 도착했습니다");
				break;
			} else if (h.pos == zb1.pos || h.pos == zb2.pos) {
				h.life -= 1;
				System.out.println("좀비에게 잡혔습니다. 현재 나의 생명은 " + h.life + "개 남았습니다.\n처음위치에서 다시 시작합니다.");
				h.pos = 1;
				zb1.pos = 7;
				zb2.pos = 15;
			}

			if (h.life == 0) {
				System.out.println("생명이 0입니다. 게임을 종료합니다.");
				break;
			}

		}
	}
}
