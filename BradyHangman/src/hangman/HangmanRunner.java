package hangman;
import java.awt.BorderLayout;
import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class HangmanRunner {

	public static void main(String[] args) throws FileNotFoundException {

		JFrame frame = new JFrame("HANGMAN!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setAlwaysOnTop(true);
		
		HangmanPanel HangmanPanel = new HangmanPanel();
		frame.add(HangmanPanel, BorderLayout.CENTER);
		
		frame.setSize(700, 700);
		frame.setVisible(true);
	}
}