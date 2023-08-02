package main;

import frames.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class Main {
	public static void main(String args[]) {
		Background first_frame = new Background();
		
		JButton loggin = new JButton("Log a vehicle");
		loggin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		loggin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loggin.setBounds(552, 312, 201, 103);
		first_frame.getContentPane().add(loggin);
		
		JButton btnNewButton = new JButton("Remove a vehicle");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(267, 312, 234, 102);
		first_frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("List of logged vehicles");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.setBounds(799, 364, 280, 103);
		first_frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.setBounds(540, 425, 226, 103);
		first_frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(91, 196, 251));
		panel.setBounds(0, 10, 1143, 282);
		first_frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Java Parking system");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		panel.add(lblNewLabel);
	}
}
