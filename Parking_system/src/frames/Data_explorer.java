package frames;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import connection.Connection_sql;
import java.sql.*;
import java.awt.Color;

public class Data_explorer {
	private JTable parking_table;
	
	Object[] data_list = new Object[5];
	
	public Data_explorer() {
		Create_panel();
	}
	
	public JPanel Create_panel() {
		JPanel panel = new JPanel();
		panel.setBounds(378, 0, 731, 738);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 134, 689, 470);
		panel.add(scrollPane);
			
		parking_table = new JTable();
		parking_table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//Creating model
		DefaultTableModel model = (DefaultTableModel)parking_table.getModel();
		parking_table.setModel(model);
		model.addColumn("License plate");
		model.addColumn("Car owner");
		model.addColumn("Entry time");
		model.addColumn("Departure time");
		model.addColumn("Payment");
		
		parking_table.getColumnModel().getColumn(0).setPreferredWidth(96);
		parking_table.getColumnModel().getColumn(1).setPreferredWidth(173);
		parking_table.getColumnModel().getColumn(2).setPreferredWidth(125);
		parking_table.getColumnModel().getColumn(3).setPreferredWidth(143);
		parking_table.getColumnModel().getColumn(4).setPreferredWidth(97);
		scrollPane.setViewportView(parking_table);
		
		JButton search_button = new JButton("Search");
		panel.add(search_button);
		search_button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		search_button.setBackground(new Color(255, 255, 255));
		search_button.setBounds(287, 630, 130, 50);
		search_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection_sql con = new Connection_sql();
				try {
					// beginning connection 
					Connection new_connection = con.begin_connection();
					Statement mystatement = new_connection.createStatement();
					ResultSet myresultset = mystatement.executeQuery("SELECT * FROM parking");
					
					while(myresultset.next()) {
						data_list[0]=(myresultset.getString("license_plate"));
						data_list[1]=(myresultset.getString("car_owner"));
						data_list[2]=(myresultset.getString("entry_time"));
						data_list[3]=(myresultset.getString("depature_time"));
						data_list[4]=(myresultset.getString("payment"));
						
						model.addRow(data_list);
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				con.close_connection();
			}
		});
		return panel;
	}
}
