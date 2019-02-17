
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JLabel label = new JLabel();
	int asciiValue;
	String result;

	public static void main(String[] args) {
		BinaryConverter bob = new BinaryConverter();
		bob.method();
	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	void method() {
		frame.setSize(500, 70);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		textfield.setPreferredSize(new Dimension(200, 25));
		panel.add(textfield);
		JButton button = new JButton();
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		frame.setTitle("computer to human");
		button.setText("CONVERT NOW");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText(convert(textfield.getText()));
		label.setVisible(true);
		frame.pack();

	}
}
