package frames;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Log_menu {
	
	JPanel panel;
	private JTextField license_text;
	private JTextField name_text;
	
	public Log_menu() {
		Create_panel();
	}
	
	public JPanel Create_panel() {
		panel = new JPanel();
		panel.setBounds(378, 0, 731, 738);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(266, 26, 153, 96);
		panel.add(lblNewLabel);
		
		license_text = new JTextField();
		license_text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(license_text.getText().length() >= 6)
			    {
			        e.consume();
			    }
			}
		});
		license_text.setHorizontalAlignment(SwingConstants.CENTER);
		license_text.setFont(new Font("Tahoma", Font.PLAIN, 25));
		license_text.setBounds(262, 212, 170, 78);
		panel.add(license_text);
		license_text.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("License Plate");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(266, 145, 166, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name of the Car Owner");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(215, 344, 273, 54);
		panel.add(lblNewLabel_2);
		
		name_text = new JTextField();
		name_text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(name_text.getText().length() >= 60)
			    {
			        e.consume();
			    }
			}
		});
		name_text.setHorizontalAlignment(SwingConstants.CENTER);
		name_text.setFont(new Font("Tahoma", Font.PLAIN, 25));
		name_text.setColumns(10);
		name_text.setBounds(65, 427, 596, 78);
		panel.add(name_text);
		
		JButton btnNewButton = new JButton("Log");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(299, 581, 102, 63);
		panel.add(btnNewButton);
		
		return panel;
	}
}
