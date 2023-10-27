package car;

import java.util.*;

public class Car {
	String carName;	//자동차 이름
	int speed;		//자동차 현재 속도
	int max;		//자동차 최고 속도
	int acc;		//최고 가속도 (1~acc)사이에 값
	int km;			//주행거리
	Random r = new Random();
	
	public Car(String c, int m, int a) {
		carName = c;
		max = m;
		acc = a;
	}
	
	public void speedUp() {
		int a = r.nextInt(acc)+1; 		//1~acc
		speed += a;
		if(speed > max) speed = max;	//최고 속도를 넘어가지 않도록
		km += speed; 					//주행거리 누적값
		System.out.println(carName + "의 현재속도는" + speed + "입니다.");
	}
	
	public void speedDown() {
		int a = r.nextInt(acc)+1; 		//1~acc
		speed -= a;
		if (speed < 0) speed = 0;
		km += speed; 					//주행거리 누적값
		System.out.println(carName + "의 현재속도는" + speed + "입니다.");
	}
	
	public void stop() {
		speed = 0;
		System.out.println(carName + "의 현재속도는" + speed + "입니다.");
	}
	
	public void printKm() {
		System.out.println(carName + "의 현재까지 주행거리는" + km + "입니다.");
	}
	
}
