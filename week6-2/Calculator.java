package classTest06;

public class Calculator {
	void powerOn() {
		System.out.println("������ �ѿ�");
	}
	
	//���ϱ�
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	//����
	int min (int x, int y) {
		int result = x - y;
		return result;
	}
	
	//���ϱ�
	double mul (int x, int y) {
		double result = (double)x * (double)y;
		return result;
	}
	
	//������
	
	//Math �Լ��� �̿��ؼ� double�� 100.00�� ������ �Ҽ��� 2�ڸ����� ���
	double div (int x, int y) {
			double result = (double)x / (double)y;
			return Math.round(result * 100) / 100.00;
		}
	
	//������
	double sel (int x, int y) {
		double result = (double)x % (double)y;
		return result;
	}
	
	
	void powerOff() {
		System.out.println("������ ����");
	}


}
