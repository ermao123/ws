package until;

import java.awt.*;

import javax.swing.*;


public class Mb1 {

	public static void main(String[] args) {
		
		JFrame jf=new JFrame("用户登陆");
		////用户点击窗口的关闭按钮时程序执行的操作
				jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				// 第 1 个 JPanel, 使用默认的浮动布局

				JPanel panel01=new JPanel();
				panel01.add(new JLabel("用户名"));
				panel01.add(new JTextField(10));
				// 第 2 个 JPanel, 使用默认的浮动布局

				JPanel panel02=new JPanel();
				panel02.add(new JLabel("密  码"));
				panel02.add(new JTextField(10));
				// 第 3 个 JPanel, 使用浮动布局, 并且容器内组件居中显示

				JPanel panel03=new JPanel(new FlowLayout(FlowLayout.CENTER));
				panel03.add(new JButton("登陆"));
				panel03.add(new JButton("注册"));
				
				
				// 创建一个垂直盒子容器, 把上面 3 个 JPanel 串起来作为内容面板添加到窗口
				Box vBox =Box.createVerticalBox();//创建一个从左到右显示其组件的box
				vBox.add(panel01);
				vBox.add(panel02);//panel 容器
				vBox.add(panel03);
				jf.setContentPane(vBox);//内容面板
				jf.pack();//调整此窗口大小，适合其子组件的首选布局和大小
				jf.setLocationRelativeTo(null);//窗口置于屏幕的中央
				jf.setVisible(true); //让jframe对象显示出来
				
				
		
	}

}
