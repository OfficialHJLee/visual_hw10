package visual10_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDragEx extends JFrame{
	public MouseDragEx() {
		super("�巡�� ���ȸ� YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		setContentPane(c);
		c.setBackground(Color.GREEN); // �ʱ� ��������

		c.addMouseMotionListener(new MouseMotionAdapter() {
			// ���콺 �巡�� ���� ���� YELLOW
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			// �巡�׸� �׸��θ� ���� GREEN
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
