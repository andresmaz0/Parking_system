package frames;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import connection.Connection_sql;

import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log_menu {
	
	JPanel panel;
	private JTextField license_text;
	private JTextField name_text;
	Date date = new Date();
	
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection_sql con = new Connection_sql();
				try {
					// beginning connection 
					Connection new_connection = con.begin_connection();
					PreparedStatement mystatement = new_connection.prepareStatement("insert INTO parking (license_plate,car_owner,entry_time,depature_time,payment)"
							+ "VALUES (?,?,?)");
					mystatement.setString(0, license_text.getText());
					mystatement.setString(0, name_text.getText());
					mystatement.setDate(0, (java.sql.Date) date);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				con.close_connection();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(299, 581, 102, 63);
		panel.add(btnNewButton);
		
		return panel;
	}
	
	public void visible_on(boolean state) {
		panel.setVisible(state);
	}
}
