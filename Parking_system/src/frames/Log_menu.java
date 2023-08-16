package frames;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Log_menu {
	
	JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	
	public Log_menu() {
		Create_panel();
		
		JLabel lblNewLabel = new JLabel("Log Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(266, 26, 153, 96);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(262, 212, 170, 78);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("License Plate");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(266, 145, 166, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name of the Car Owner");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(215, 344, 273, 54);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(65, 427, 596, 78);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("Log");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(305, 587, 102, 63);
		panel.add(btnNewButton);
	}
	
	public JPanel Create_panel() {
		panel = new JPanel();
		panel.setBounds(378, 0, 731, 738);
		panel.setLayout(null);
		
		return panel;
	}
}
