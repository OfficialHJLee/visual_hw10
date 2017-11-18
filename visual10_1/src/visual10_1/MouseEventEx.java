package visual10_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventEx extends JFrame {
	public MouseEventEx() {
		super("마우스 올리기 내리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // 컨텐트팬에 붙이기
		
		label.addMouseListener(new MouseAdapter() {
			// 마우스를 올릴 때
			public void mouseEntered(MouseEvent e) { 
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			// 마우스가 올려져있지 않을 때
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});	
		setSize(250, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventEx();
	}
}
