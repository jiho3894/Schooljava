package week6;

public class SingletonExRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();*/
		/* �̱����̶�� �ϳ��� ��ü�� return �ϱ� ������
		 * ���� obj1, obj2�� ������ ��ü�� �����մϴ�.*/
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
	}

}
