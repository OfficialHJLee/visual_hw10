package visual10_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDragEx extends JFrame{
	public MouseDragEx() {
		super("드래그 동안만 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		setContentPane(c);
		c.setBackground(Color.GREEN); // 초기 배경색지정

		c.addMouseMotionListener(new MouseMotionAdapter() {
			// 마우스 드래그 동안 배경색 YELLOW
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			// 드래그를 그만두면 배경색 GREEN
			public void mouseMoved(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}
		});
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseDragEx();
	}
}
