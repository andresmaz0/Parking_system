package frames;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_menu {
	
	Panel panel;

	public Main_menu() {
		Create_panel(null,null,null);
	}
	
	public Panel Create_panel(Data_explorer data_panel, Log_menu log_panel, Remove_menu remove_panel) {
		panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 376, 743);
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
		
		JButton remove_button = new JButton("Remove a vehicle");
		remove_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data_panel.visible_on(false);
				log_panel.visible_on(false);
				remove_panel.visible_on(true);
			}
		});
		remove_button.setBounds(61, 460, 250, 61);
		panel.add(remove_button);
		remove_button.setBackground(new Color(255, 255, 255));
		remove_button.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton loggin_button = new JButton("Log a vehicle");
		loggin_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data_panel.visible_on(false);
				log_panel.visible_on(true);
				remove_panel.visible_on(false);
			}
		});
		loggin_button.setBounds(61, 371, 250, 61);
		panel.add(loggin_button);
		loggin_button.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton list_button = new JButton("List of vehicles");
		list_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data_panel.visible_on(true);
				log_panel.visible_on(false);
				remove_panel.visible_on(false);
			}
		});
		list_button.setBounds(60, 549, 251, 70);
		panel.add(list_button);
		list_button.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton exit_button = new JButton("Exit");
		exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit_button.setBounds(61, 649, 250, 61);
		panel.add(exit_button);
		exit_button.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		return panel;
	}
}
