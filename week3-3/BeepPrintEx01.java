package threadEx01;

import java.awt.Toolkit;

public class BeepPrintEx01 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit ��ü�ޱ�
      for(int i=0; i<5; i++) {
         toolkit.beep();
         try {
            Thread.sleep(500); //0.5�� �Ͻ� ����
         }catch(Exception e) {
         }
      }
      for(int i=0; i<5; i++) {
         System.out.println("��");
         try {
            Thread.sleep(500); //0.5�� �Ͻ� ����
         }catch(Exception e) {
         }
      }
   }

}