/**
 * @author YongJae + KimJerry
 *
 */
package grab;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyEventHandler implements KeyListener {

	private JLabel label;

	public KeyEventHandler(JLabel label) {
		this.label = label;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {

		case KeyEvent.VK_LEFT:
			if (label.getX() > 0)
				label.setLocation(label.getX() - Const.IMAGE_SIZE_X, 0);
			break;
		case KeyEvent.VK_RIGHT:
			if (label.getX() < 400)
				label.setLocation(label.getX() + Const.IMAGE_SIZE_X, 0);
			break;

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// System.out.println("keyTyped");
	}

}

class grab {

	public static void main(String[] argv) {

		try {
			JFrame frm = new JFrame("Grab test frame");
			// JFrame의 위치 선정 방법을 Absolute Position으로 만듬
			frm.setLayout(null);
			// JFrame의 초기 위치/크기
			frm.setBounds(120, 120, 400, 100);
			
			// grab.jpg의 라벨 생성
			JLabel label = new JLabel(
					new ImageIcon(ImageIO.read(new File(System.getProperty("user.dir") + "\\image\\grab.jpg"))));

			// 이미지의 위치/크기 조정
			label.setBounds(0, 0, Const.IMAGE_SIZE_X, Const.IMAGE_SIZE_Y);

			// 이미지를 프레임에 추가
			frm.getContentPane().add(label);
			
			// 프레임이 키에 반응하도록 리스너 추가
			frm.addKeyListener(new KeyEventHandler(label));
			frm.setVisible(true);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}