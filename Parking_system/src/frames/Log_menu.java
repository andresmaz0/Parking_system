package frames;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Log_menu {
	
	JPanel panel;
	
	public Log_menu() {
		Create_panel();
		
		JLabel lblNewLabel = new JLabel("Log Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(266, 27, 153, 96);
		panel.add(lblNewLabel);
	}
	
	public JPanel Create_panel() {
		panel = new JPanel();
		panel.setBounds(378, 0, 731, 738);
		panel.setLayout(null);
		
		return panel;
	}
}
