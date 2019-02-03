package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500, 70);
		frame.setVisible(true);
		JPanel panel=new JPanel();
		JButton button=new JButton();
		panel.add(button);
		frame.add(panel);
		JTextField textfield=new JTextField();
		textfield.setSize(100, 50);
		panel.add(textfield);
		frame.setTitle("computer to human");
		button.setText("CONVERT NOW");
	}
	}
