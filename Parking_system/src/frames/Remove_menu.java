package frames;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class Remove_menu {
	
	JPanel panel;
	private JTextField license_text;
	private JTextField payment_text;
	
	public Remove_menu() {
		Create_panel();
		
		JLabel lblNewLabel = new JLabel("Remove vehicle menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(208, 42, 304, 63);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("License Plate");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(271, 150, 166, 42);
		panel.add(lblNewLabel_1);
		
		license_text = new JTextField();
		license_text.setHorizontalAlignment(SwingConstants.CENTER);
		license_text.setFont(new Font("Tahoma", Font.PLAIN, 25));
		license_text.setColumns(10);
		license_text.setBounds(267, 217, 170, 78);
		panel.add(license_text);
		
		payment_text = new JTextField();
		payment_text.setFont(new Font("Tahoma", Font.PLAIN, 25));
		payment_text.setBackground(new Color(255, 255, 255));
		payment_text.setEnabled(false);
		payment_text.setBounds(215, 539, 279, 119);
		panel.add(payment_text);
		payment_text.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Payment to be made");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(242, 473, 238, 38);
		panel.add(lblNewLabel_2);
		
		JButton remove_button = new JButton("Remove Vehicle");
		remove_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		remove_button.setBounds(228, 342, 241, 83);
		panel.add(remove_button);
	}
	
	public JPanel Create_panel() {
		panel = new JPanel();
		panel.setBounds(378, 0, 731, 738);
		panel.setLayout(null);
		
		return panel;
	}
}
