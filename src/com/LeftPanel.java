package com;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import until.SwingUtil;

public class LeftPanel extends JPanel{
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	public  LeftPanel() {
		initComponents();
		
		setVisible(true);
	}
	private void initComponents() {
		this.setLayout(null);
		
		
		
		btn1=new JButton("�˵�һ");
		btn1.setBounds(10, 0, 80, 150);
		btn1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			MainFrame main=SwingUtil.getMainFrame();
			CenterPanel jpCenter=main.getCenterPanel();
			jpCenter.removeAll();
			jpCenter.setLayout(new BorderLayout());
			jpCenter.add(new JLabel("�˵�һ"),BorderLayout.CENTER);
			
			
			jpCenter.revalidate();//�Ƿ���Ч
			jpCenter.repaint();//�ػ�
			
			
		}
	});
		btn2=new JButton("�˵���");
		btn2.setBounds(10,150, 80, 150);
		btn2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			MainFrame main=SwingUtil.getMainFrame();
			CenterPanel jpCenter=main.getCenterPanel();
			jpCenter.removeAll();
			jpCenter.setLayout(new BorderLayout());
			jpCenter.add(new JLabel("�˵���"),BorderLayout.CENTER);
			
			
			jpCenter.revalidate();//�Ƿ���Ч
			jpCenter.repaint();//�ػ�
			
			
		}
	});
		btn3=new JButton("�˵���");
		btn3.setBounds(10,300, 80, 150);
		btn3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			MainFrame main=SwingUtil.getMainFrame();
			CenterPanel jpCenter=main.getCenterPanel();
			jpCenter.removeAll();
//���JComboBox ��Ԫ��ʹ��add()��ӵ�,����removeAll()�Ƴ����������addItem()��ӵ�,����removeAllItems()�Ƴ���
			jpCenter.setLayout(new BorderLayout());
			jpCenter.add(new JLabel("�˵���"),BorderLayout.CENTER);
			
			
			jpCenter.revalidate();//�Ƿ���Ч
			jpCenter.repaint();//�ػ�
			
			
		}
	});
		
	add(btn1);
	add(btn2);
	add(btn3);
	
	
	}}
