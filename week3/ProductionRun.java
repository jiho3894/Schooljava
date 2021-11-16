package thread01;
/* �ϳ��� ���μ��� �ȿ��� �� �� �̻��� �����尡 
 * �����Ǹ� �����͸� ���� �� �� �ִ�.   */ 
class SharedData{
	/*  �ʵ� ����  */ 
	private int data; 
	/*  �޼��� ����  */ 
	public void put(int data) {
		this.data = data; 
	}
	
	public int get() {
		return data; 
	}
}

/*  Thread 1���� --> ����  */
class Producer implements Runnable{
	/* �ʵ� ���� */ 
	private SharedData shared;
	/* ������ ���� */ 
	public Producer(SharedData sd) {
		shared = sd; 
		}
		/* �޼��� */ 
		public void run() {
			for(int i=1; i<=5; i++) {
				try {
					Thread.sleep((int) (Math.random() * 1000));
				} catch(InterruptedException e) {
					e.printStackTrace();
				} 
				shared.put(i);
				System.out.println("�׸�:" + i +": ���� �Ϸ��Դϴ�.");
			}
		}
}

/* Thread 2 --> �Һ�   */ 
class Consumer implements Runnable {
	/* �ʵ� ���� */ 
	private SharedData shared;
	/* ������ ���� */ 
	public Consumer(SharedData sd) {
		shared = sd; 
	}

	/*  �޼���  */
	public void run() {
		int data; 
		do {
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			data = shared.get(); 
			System.out.println("�׸�" + data + ": �Һ� �Ϸ�Ǿ����ϴ�.");
		}while(data<5); 
	}
}

public class ProductionRun {
	/*  �ʵ� ����  */ 
	/* ������ ���� */ 
	/* �޼��� --> Thread    */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedData sd = new SharedData(); /*  ���� ������ */ 
		Thread t1 = new Thread(new Producer(sd)); /*  ������ 1: ����   */ 
		Thread t2 = new Thread(new Consumer(sd)); /*  ������ 2: �Һ�  */ 
		t1.start(); 
		t2.start(); 
	}
}