package com;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

import until.SwingUtil;

public class MainFrame extends JFrame {

	public static void main(String[] args) {
		new MainFrame();
	}
   private LeftPanel leftPanel=null;
   private CenterPanel centerPanel=null;
   
   public MainFrame() {
	   setTitle("天美系统");
	   setSize(800,500);
	//初始化容器
	   initPanel();
	 //初始化中间容器  
	   initCenterPanel();
	   
	   SwingUtil.setMainFrame(this);
	   
	   setVisible(true);
	   
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
   }
   public CenterPanel getCenterPanel() {
	   return centerPanel;
   }
   //中间容器
	private void initCenterPanel() {
		centerPanel=new CenterPanel();
		 JLabel label =new JLabel("主页面");
		 centerPanel.add(label);
		 this.add(centerPanel,BorderLayout.CENTER);
		
		
	}
	private void initPanel() {  
		leftPanel=new LeftPanel();
		leftPanel.setPreferredSize(new Dimension(120,575));
		this.add(leftPanel,BorderLayout.WEST);
	}
	
	
	
	
	
}
