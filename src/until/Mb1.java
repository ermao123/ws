package until;

import java.awt.*;

import javax.swing.*;


public class Mb1 {

	public static void main(String[] args) {
		
		JFrame jf=new JFrame("�û���½");
		////�û�������ڵĹرհ�ťʱ����ִ�еĲ���
				jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				// �� 1 �� JPanel, ʹ��Ĭ�ϵĸ�������

				JPanel panel01=new JPanel();
				panel01.add(new JLabel("�û���"));
				panel01.add(new JTextField(10));
				// �� 2 �� JPanel, ʹ��Ĭ�ϵĸ�������

				JPanel panel02=new JPanel();
				panel02.add(new JLabel("��  ��"));
				panel02.add(new JTextField(10));
				// �� 3 �� JPanel, ʹ�ø�������, �������������������ʾ

				JPanel panel03=new JPanel(new FlowLayout(FlowLayout.CENTER));
				panel03.add(new JButton("��½"));
				panel03.add(new JButton("ע��"));
				
				
				// ����һ����ֱ��������, ������ 3 �� JPanel ��������Ϊ���������ӵ�����
				Box vBox =Box.createVerticalBox();//����һ����������ʾ�������box
				vBox.add(panel01);
				vBox.add(panel02);//panel ����
				vBox.add(panel03);
				jf.setContentPane(vBox);//�������
				jf.pack();//�����˴��ڴ�С���ʺ������������ѡ���ֺʹ�С
				jf.setLocationRelativeTo(null);//����������Ļ������
				jf.setVisible(true); //��jframe������ʾ����
				
				
		
	}

}
