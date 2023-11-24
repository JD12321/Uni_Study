package fighter;

public class FighterGame {
	public static void main(String[] args) {
		Character ryu = new Character("류", 100, 20);
		Character ken = new Character("켄", 200, 10);
		
		while (true) {
			ken.setHp(ken.getHp() - ryu.attack(20)); // 류가 켄을 공격하여 hp를 줄임
			ryu.setHp(ryu.getHp() - ken.attack(10)); // 켄이 류를 공격하여 hp를 줄임

			boolean isAlive = ryu.attack(ken);
			if (isAlive == false) {
				break;
			}
		}

	}
}
