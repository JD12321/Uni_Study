package dog;

public class Dog {
	String name;
	int age;
	
	public Dog(String n, int a) {
		name = n;
		age = a;
	}
	
	public void bark() {
		System.out.println(name + "이(가) 멍멍하고 짖었습니다.");
	}
	
	public void bite(String n) {
		System.out.println(name + "이(가)" + n + "을 물었습니다.");
	}
}
