package testJava04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭�� ArrayList�� ������
		// �迭�� ũ�Ⱑ �����Ǿ� ������ ArrayList�� ũ�Ⱑ
		// �������� �� �� �ִ� �� ArrayList�� type object�� ������� �迭�� �ٸ���
		// ������ object element�� ���� �� ����
		List<String> lst = new ArrayList<String>();  //String �� ArrayList ����
		lst.add("alpha"); //�߰��ϱ�
		lst.add("beta");
		lst.add("smartIT");
		System.out.println(lst);
	
		Iterator<String> iter = lst.iterator();  //String �� Iterator ����
		while(iter.hasNext()) {
			String str = iter.next();  // next�� ���� element�� �����͸� �̵��Ͽ� ��ȸ
			System.out.println(str);
		}
		
		for(String str : lst) {  // �⼧�� for��
			System.out.println(str);
		}
	}
}
