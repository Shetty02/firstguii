import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	public GUI() {

		JFrame frame = new JFrame();

		JButton button = new JButton("Click Me");
		JLabel lable = new JLabel("Numbers of Clicks : 0");

		JPanel panel = new JPanel();

		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(lable);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Create GUI");
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new GUI();

	}

}
