package visual10_6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickEx extends JFrame{
	public ClickEx() {
		super("Ŭ�� ������ �������α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JLabel la = new JLabel("C"); // JLabel ����
		la.setSize(10, 10);
		la.setLocation(100, 100); // ���� �ʱ� ��ġ ����
		c.add(la);
		
		la.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JLabel label = (JLabel)e.getSource();
				int x = (int)(Math.random() * 100);
				int y = (int)(Math.random() * 100);
				label.setLocation(x, y); // Ŭ���� ������ġ�� �̵�
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ClickEx();
	}

}
