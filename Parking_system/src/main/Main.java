package main;

import frames.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Main {
	public static void main(String args[]) {
		Background first_frame = new Background();
		
		JButton loggin = new JButton("Log a vehicle");
		loggin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		loggin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loggin.setBounds(634, 278, 201, 103);
		first_frame.getContentPane().add(loggin);
		
		JButton btnNewButton = new JButton("Remove a vehicle");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(349, 289, 234, 102);
		first_frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("List of logged vehicles");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.setBounds(443, 105, 280, 103);
		first_frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.setBounds(540, 425, 226, 103);
		first_frame.getContentPane().add(btnNewButton_2);
	}
}
