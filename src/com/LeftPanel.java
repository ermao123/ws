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
		
		
		
		btn1=new JButton("菜单一");
		btn1.setBounds(10, 0, 80, 150);
		btn1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			MainFrame main=SwingUtil.getMainFrame();
			CenterPanel jpCenter=main.getCenterPanel();
			jpCenter.removeAll();
			jpCenter.setLayout(new BorderLayout());
			jpCenter.add(new JLabel("菜单一"),BorderLayout.CENTER);
			
			
			jpCenter.revalidate();//是否有效
			jpCenter.repaint();//重绘
			
			
		}
	});
		btn2=new JButton("菜单二");
		btn2.setBounds(10,150, 80, 150);
		btn2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			MainFrame main=SwingUtil.getMainFrame();
			CenterPanel jpCenter=main.getCenterPanel();
			jpCenter.removeAll();
			jpCenter.setLayout(new BorderLayout());
			jpCenter.add(new JLabel("菜单二"),BorderLayout.CENTER);
			
			
			jpCenter.revalidate();//是否有效
			jpCenter.repaint();//重绘
			
			
		}
	});
		btn3=new JButton("菜单三");
		btn3.setBounds(10,300, 80, 150);
		btn3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			MainFrame main=SwingUtil.getMainFrame();
			CenterPanel jpCenter=main.getCenterPanel();
			jpCenter.removeAll();
//如果JComboBox 的元素使用add()添加的,就用removeAll()移出。如果是用addItem()添加的,就用removeAllItems()移出。
			jpCenter.setLayout(new BorderLayout());
			jpCenter.add(new JLabel("菜单三"),BorderLayout.CENTER);
			
			
			jpCenter.revalidate();//是否有效
			jpCenter.repaint();//重绘
			
			
		}
	});
		
	add(btn1);
	add(btn2);
	add(btn3);
	
	
	}}
