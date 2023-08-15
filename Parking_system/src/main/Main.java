package main;

import frames.*;
import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String args[]) {
		Background first_frame = new Background();
		first_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		first_frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 376, 743);
		first_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(-18, 78, 350, 283);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Curso Oracle One\\Parking system\\Pictures\\parking.jpg"));
		
		JLabel lblNewLabel = new JLabel("Java Parking system");
		lblNewLabel.setBounds(30, 24, 322, 44);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		
		JButton btnNewButton = new JButton("Remove a vehicle");
		btnNewButton.setBounds(61, 460, 250, 61);
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton loggin = new JButton("Log a vehicle");
		loggin.setBounds(61, 371, 250, 61);
		panel.add(loggin);
		loggin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnNewButton_1 = new JButton("List of vehicles");
		btnNewButton_1.setBounds(60, 549, 251, 70);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(61, 649, 250, 61);
		panel.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
	}
}
