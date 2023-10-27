package dog;

public class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog("돌돌이", 5);
		
		d1.bark();
		d1.bite("도둑");
		
		Dog d2 = new Dog("스누피", 10);
		d2.bite("사람");
	}
}
