package ch01data;



public class Button {

	/*  Ŭ���� = �ʵ�� �޼���  */
	/*  �ʵ� ���� */ 
	OnClickListener listener;  /* ��ư Ŭ�������ο� �ִ� 
	��� ���α׷��� ���Ǵ� �������� ó�� ���   */ 

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener; 
	}
		/* �޼��� ���� */ 

	void touch() {
		listener.onClick(); 
	}

	interface OnClickListener{
		void onClick(); 
	 }
}