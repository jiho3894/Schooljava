package combo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/* �޴��� 4���� �޴� �������� ����� 
 *  Load �޴� �������� �����ϸ� 
 *  �̹��� �ϳ��� �ε��Ͽ� ���  */ 
public class MenuActionEvent extends JFrame {
	/* �ʵ� ����  */ 
	JLabel imgLabel = new JLabel();  /* �� �̹����� ������ ���̺�   */
	/* ������  */ 
	MenuActionEvent(){
		setTitle("Menu Ȱ��"); 
		createMenu(); 
		getContentPane().add(imgLabel, BorderLayout.CENTER); 
		setSize(400, 350); 
		setVisible(true); 
	}
	/* �޴��ٿ� �޴� ����   */ 
	void createMenu(){
	JMenuBar mb = new JMenuBar();
	/* �޴��� 4���� �޴��׸�  */ 
	JMenuItem[] menuItem = new JMenuItem[4]; 
	String[] itemTitle = {"Load", "Hide", "Reshow", "Exit"   };
	JMenu screenMenu = new JMenu("Screen"); 
	 /* �̺�Ʈ ó��  */
	 MenuActionListener listener = new MenuActionListener(); 
	 
	 for(int i=0; i<menuItem.length; i++) {
		 menuItem[i] = new JMenuItem(itemTitle[i]); 
		 menuItem[i].addActionListener(listener);
		 screenMenu.add(menuItem[i]); 
	 }
	 mb.add(screenMenu); 
	 setJMenuBar(mb); 
	}
	/* �޴� ������ó���� ���� �̺�Ʈ(actionListener)  */ 
	class MenuActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String cmd = e.getActionCommand(); 
			/* ������ �޴��׸��� ���ڿ� ����   */
			switch(cmd) {
			case "Load":
				if(imgLabel.getIcon() !=null ) return; 
				imgLabel.setIcon(new ImageIcon("image/ap01.JPG")); break;
			case "Hide":
				imgLabel.setVisible(false); break; 
			case "Reshow":
				imgLabel.setVisible(true); break; 
			case "Exit": 
				System.exit(0); break; 
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuActionEvent(); 
	}
}