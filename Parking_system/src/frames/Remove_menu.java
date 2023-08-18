package frames;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import connection.Connection_sql;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

public class Remove_menu {
	
	JPanel panel;
	private JTextField license_text;
	private JTextField payment_text;
	Double payment;
	private JTextField text_parkinghours;
	
	public Remove_menu() {
		Create_panel(null);
		
	}
	
	public JPanel Create_panel(Log_menu log_panel) {
		panel = new JPanel();
		panel.setBounds(378, 0, 731, 738);
		panel.setLayout(null);
		
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
		payment_text.setDisabledTextColor(new Color(0, 0, 0));
		payment_text.setHorizontalAlignment(SwingConstants.CENTER);
		payment_text.setEnabled(false);
		payment_text.setFont(new Font("Tahoma", Font.PLAIN, 25));
		payment_text.setBackground(new Color(255, 255, 255));
		payment_text.setBounds(43, 537, 279, 119);
		panel.add(payment_text);
		payment_text.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Payment to be made");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(68, 472, 238, 38);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("The cost of parking is 7.5$ per hour");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(197, 680, 311, 31);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Parking hours");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(437, 472, 176, 38);
		panel.add(lblNewLabel_4);
		
		text_parkinghours = new JTextField();
		text_parkinghours.setHorizontalAlignment(SwingConstants.CENTER);
		text_parkinghours.setFont(new Font("Tahoma", Font.PLAIN, 25));
		text_parkinghours.setEnabled(false);
		text_parkinghours.setDisabledTextColor(Color.BLACK);
		text_parkinghours.setColumns(10);
		text_parkinghours.setBackground(Color.WHITE);
		text_parkinghours.setBounds(377, 537, 279, 119);
		panel.add(text_parkinghours);
		
		JButton remove_button = new JButton("Remove Vehicle");
		remove_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Connection_sql con = new Connection_sql();
				try {
					
					//First Query
					
					// beginning connection 
					Connection new_connection = con.begin_connection();
					PreparedStatement mystatement = new_connection.prepareStatement("Update parking SET depature_time = ?" +
					" WHERE license_plate=?");
					// Getting current time
		            LocalTime current_time = LocalTime.now();

		            // Convert Localtime to Time
		            Time depature_time = Time.valueOf(current_time);
		            
		            mystatement.setTime(1, depature_time);	
					mystatement.setString(2, (license_text.getText()).toString());
					
					mystatement.executeUpdate();
					
					//Second Query
					
					PreparedStatement mystatement2 = new_connection.prepareStatement("SELECT TIMESTAMPDIFF(HOUR,entry_time,depature_time) FROM parking" +
							" WHERE license_plate=?");
					mystatement2.setString(1, (license_text.getText()).toString());
					ResultSet myresultset = mystatement2.executeQuery();
					
					while(myresultset.next()) {
						payment = myresultset.getInt(1) * 7.45;
						text_parkinghours.setText(myresultset.getString(1));
					}
					payment_text.setText(payment.toString()+"$");
					
					//Third Query
					PreparedStatement mystatement3 = new_connection.prepareStatement("Update parking SET payment = ?" +
							" WHERE license_plate=?");
					
					mystatement3.setDouble(1, payment);	
					mystatement3.setString(2, (license_text.getText()).toString());
					
					mystatement3.executeUpdate();
					
					JOptionPane.showMessageDialog(remove_button, "Vehicle removed");
					
					mystatement2.close();
					mystatement.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				con.close_connection();
			}
		});
		remove_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		remove_button.setBounds(228, 342, 241, 83);
		panel.add(remove_button);
		
		panel.setVisible(false);
		
		return panel;
	}
	
	public void visible_on(boolean state) {
		panel.setVisible(state);
	}
}
