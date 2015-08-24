package game;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Snake extends JFrame {
	public Snake() {
		add(new Board());

		setResizable(false);
		pack();
		setTitle("Snake");
		// centers the window
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JFrame ex = new Snake();
		ex.setVisible(true);

	}

}
