package fighter;

import java.util.*;

public class FightGame {
	public static void main(String[] args) {
		Random r = new Random();

		Character me = new Character("은지담", 200, 15);
		Boss boss = new Boss("보스", 300, 20);

		while (true) {
			int mc = r.nextInt(2);
			if (mc == 0) {
				boss.hp -= me.attack(15);
				System.out.println(boss.name + "의 현재 hp는 " + boss.hp + "입니다.");
			} else
				System.out.println(me.name + "의 공격 방어");
			if (boss.hp < 0) {
				System.out.println(boss.name + "이(가) 쓰러졌습니다. 게임을 종료합니다.");
				break;
			}

			int bc = r.nextInt(5);
			if (bc == 0)
				me.hp -= me.dps(mc) * boss.psg();
			else
				me.hp -= me.dps(mc) * boss.Battack();

			System.out.println(me.name + "의 현재 hp는 " + me.hp + "입니다.");

			if (me.hp < 0) {
				System.out.println(me.name + "이(가) 쓰러졌습니다. 게임을 종료합니다.");
				break;
			}

		}
	}
}
