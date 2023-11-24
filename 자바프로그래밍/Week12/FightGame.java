package fighter;

public class FightGame {
	public static void main(String[] args) {
		
		Character me = new Character("은지담", 100, 20);
		Boss boss = new Boss("보스", 200, 10);
		
		while(true) {
			boolean kenAlive = me.attack(boss);
			if(kenAlive==false) {
				break;
			}
			boolean ryuAlive = boss.attack(me);
			if(ryuAlive==false) {
				break;
			}
		}
	}
}
