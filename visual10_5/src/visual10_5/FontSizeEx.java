package visual10_5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontSizeEx extends JFrame{
	public FontSizeEx() {
		super("+,- Ű�� ��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10)); // Arial ��Ʈ�� 10�ȼ�ũ��
		Font f = label.getFont();
		int size = f.getSize();
		c.add(label); // ����Ʈ�ҿ� ���̱�
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// +�Է½� size+5, -�Է½� size-5
				if(e.getKeyChar() == '+') {
					label.setFont(new Font("Arial", Font.PLAIN, size+5));
				}
				else if(e.getKeyChar() == '-') {
					if(size > 5)
					label.setFont(new Font("Arial", Font.PLAIN, size-5));
				}
			}
		});
		setSize(250, 100);
		setVisible(true);
		label.requestFocus();
	}
	public static void main(String[] args) {
		new FontSizeEx();
	}
}
