package visual10_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftKeySlideEx extends JFrame {
	public LeftKeySlideEx() {
		super("Left키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // 컨텐트팬에 붙이기
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {  
			    if(e.getKeyCode() == KeyEvent.VK_LEFT)  {
			    	String loveJava = "Love Java";
			    	// 맨 앞 한 글자씩 떼서 리턴하여 움직이는 것 처럼 보이도록함
					String moveString = loveJava.substring(1) + loveJava.substring(0, 1);
			    	loveJava = new String(moveString);
			    	label.setText(moveString);
			    }
			}
		});
		setSize(250, 100);
		setVisible(true);
		
		label.requestFocus(); // 입력을 받을 수 있도록하는 포커스 설정
	}
	public static void main(String[] args) {
		new LeftKeySlideEx();
	}
}
