package ch01data;
/*  �տ��� ��ư Ŭ����(class Button) �����  */ 
public class Window {
	/*  �ʵ� ����  */
	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	 
	/* �޼��� ����   */
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("��ȭ�� ���մϴ�.");
		}
	};
	
	Button.OnClickListener finish = new Button.OnClickListener() {
		@Override public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("��ȭ�� �����ϴ�.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
		@Override public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("message�� �����ϴ�.");
			}
		});
		button3.setOnClickListener(finish);
	}
}