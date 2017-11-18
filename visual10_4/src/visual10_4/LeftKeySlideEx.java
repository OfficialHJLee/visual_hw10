package visual10_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftKeySlideEx extends JFrame {
	public LeftKeySlideEx() {
		super("LeftŰ�� ���ڿ� �̵�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // ����Ʈ�ҿ� ���̱�
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {  
			    if(e.getKeyCode() == KeyEvent.VK_LEFT)  {
			    	String loveJava = "Love Java";
			    	// �� �� �� ���ھ� ���� �����Ͽ� �����̴� �� ó�� ���̵�����
					String moveString = loveJava.substring(1) + loveJava.substring(0, 1);
			    	loveJava = new String(moveString);
			    	label.setText(moveString);
			    }
			}
		});
		setSize(250, 100);
		setVisible(true);
		
		label.requestFocus(); // �Է��� ���� �� �ֵ����ϴ� ��Ŀ�� ����
	}
	public static void main(String[] args) {
		new LeftKeySlideEx();
	}
}
