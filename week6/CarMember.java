package week6;

public class CarMember {
	/* �ʵ� ���� */
	String model;
	int speed;
	
	/* ������ ���� */
	CarMember(String model){
		this.model = model;
	}
	/* �޼��� ���� */
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed + "km/h)");
		}
	}
}
