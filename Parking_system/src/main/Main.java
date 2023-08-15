package main;

import frames.*;
import javax.swing.*;

public class Main {
	public static void main(String args[]) {
		Background first_frame = new Background();
		first_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		first_frame.getContentPane().setLayout(null);
		Main_menu mymenu = new Main_menu();
		first_frame.getContentPane().add(mymenu.Create_panel());		
		Data_explorer myexplorer = new Data_explorer();
		first_frame.getContentPane().add(myexplorer.Create_panel());
	}
}
