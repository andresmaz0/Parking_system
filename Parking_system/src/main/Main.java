package main;

import frames.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Button;

public class Main {
	public static void main(String args[]) {
		Background first_frame = new Background();
		first_frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 478, 743);
		first_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(-21, 85, 467, 283);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Curso Oracle One\\Parking system\\Pictures\\parking.jpg"));
		
		JLabel lblNewLabel = new JLabel("Java Parking system");
		lblNewLabel.setBounds(85, 10, 322, 44);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		
		JButton btnNewButton = new JButton("Remove a vehicle");
		btnNewButton.setBounds(107, 486, 250, 61);
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton loggin = new JButton("Log a vehicle");
		loggin.setBounds(107, 404, 250, 61);
		panel.add(loggin);
		loggin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnNewButton_1 = new JButton("List of logged vehicles");
		btnNewButton_1.setBounds(107, 569, 251, 70);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(107, 660, 250, 61);
		panel.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(479, 0, 4, 743);
		first_frame.getContentPane().add(panel_1);
		loggin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
