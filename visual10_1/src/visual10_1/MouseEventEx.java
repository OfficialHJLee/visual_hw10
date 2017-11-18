package visual10_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventEx extends JFrame {
	public MouseEventEx() {
		super("���콺 �ø��� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // ����Ʈ�ҿ� ���̱�
		
		label.addMouseListener(new MouseAdapter() {
			// ���콺�� �ø� ��
			public void mouseEntered(MouseEvent e) { 
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			// ���콺�� �÷������� ���� ��
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");
			}			
		});	
		setSize(250, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventEx();
	}
}
