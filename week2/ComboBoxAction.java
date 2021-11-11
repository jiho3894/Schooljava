package combo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/* �޺��ڽ��� �����ϰ� �̺�Ʈ ó�� �ϴ� ���α׷�  */ 

public class ComboBoxAction extends JFrame {
	/* �ʵ� ����   */
	String[] ff = {"ap01", "ba01", "ma01"  };
	/*  �޺��ڽ� �׸�  */
	ImageIcon[] images = { new ImageIcon("image/ap01.JPG"), 
			new ImageIcon("image/ba01.JPG"), 
			new ImageIcon("image/ma01.JPG")};  /* �̹��� ������ �迭ó�� */ 
	/* JLabel --> �̹����� ����� ���̺�   */
	JLabel imgLabel = new JLabel(images[0]); 

	/*  ������ */ 
   ComboBoxAction(){
	  setTitle("�޺��ڽ� �޴� ");
	  Container  c = getContentPane(); 
	  c.setLayout(new FlowLayout());
	  /* �޺� �ڽ��� ����  */ 
	  JComboBox combo = new JComboBox(ff); 
	  c.add(combo); 
	  c.add(imgLabel); 
	  /*  �޺��ڽ����� ActionListener ��� --> ���õ� �̹��� ��� ó��  */
	  combo.addActionListener(new ActionListener() {
		  /*  implement method --> override  */ 
		@Override

		public void actionPerformed(ActionEvent e) {
			/* �׼� �̺�Ʈ�� �߻�  */ 
			JComboBox cb = (JComboBox) e.getSource(); 
			/* �׼� �̺�Ʈ�� �߻��� �޺��ڽ��� �˾Ƴ��� ���Ͽ�  */
			int index = cb.getSelectedIndex(); 
			/* �ε����� �̹����� �̹��� ���̺� ��� */
			imgLabel.setIcon(images[index]);
		}
	  });
	  setSize(300, 400); 
	  setVisible(true); 
   	}
	/* �޼���  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxAction(); 
	}
}