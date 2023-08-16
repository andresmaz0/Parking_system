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
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

public class Remove_menu {
	
	JPanel panel;
	private JTextField license_text;
	private JTextField payment_text;
	Double payment;
	
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
		payment_text.setText(payment.toString());
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
		remove_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection_sql con = new Connection_sql();
				try {
					// beginning connection 
					Connection new_connection = con.begin_connection();
					PreparedStatement mystatement = new_connection.prepareStatement("insert INTO parking (depature_time,payment)"
							+ "VALUES (?,?) WHERE license_plate=?");
					// Obtener la hora actual
		            LocalTime current_time = LocalTime.now();

		            // Convertir la hora actual a Time
		            Time depature_time = Time.valueOf(current_time);
					
		            payment = ((log_panel.get_time()).compareTo(depature_time))*10.50;
		            
		            mystatement.setTime(1, depature_time);	
					mystatement.setString(3, license_text.getText());
					mystatement.setDouble(2, payment);
					
					mystatement.executeUpdate();
					
					JOptionPane.showMessageDialog(remove_button, "Vehicle removed");
					
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
		
		return panel;
	}
	
	public void visible_on(boolean state) {
		panel.setVisible(state);
	}
	
}
