package visual10_5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontSizeEx extends JFrame{
	public FontSizeEx() {
		super("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10)); // Arial 폰트로 10픽셀크기
		Font f = label.getFont();
		int size = f.getSize();
		c.add(label); // 컨텐트팬에 붙이기
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// +입력시 size+5, -입력시 size-5
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
