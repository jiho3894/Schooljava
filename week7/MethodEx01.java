package week7;

public class MethodEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Physical obj;
		obj = new Physical("��ź", 25, 177.2f, 70.5f);
		printPhysical(obj);
	}
	
	static void printPhysical(Physical obj) {
		System.out.println("�̸�:" + obj.name);
		System.out.println("����:" + obj.age);
		System.out.println("Ű:" + obj.height);
		System.out.println("ü��:" + obj.weight);
	}
	
}
