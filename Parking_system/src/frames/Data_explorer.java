package frames;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Data_explorer {
	private JTable parking_table;
	
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
		parking_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"License plate", "Car owner", "Entry time", "Departure time", "Payment"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		parking_table.getColumnModel().getColumn(0).setPreferredWidth(96);
		parking_table.getColumnModel().getColumn(1).setPreferredWidth(173);
		parking_table.getColumnModel().getColumn(2).setPreferredWidth(125);
		parking_table.getColumnModel().getColumn(3).setPreferredWidth(143);
		parking_table.getColumnModel().getColumn(4).setPreferredWidth(97);
		scrollPane.setViewportView(parking_table);
		
		JButton search_button = new JButton("Search");
		search_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)parking_table.getModel();
			}
		});
		search_button.setBounds(315, 645, 85, 21);
		panel.add(search_button);
		return panel;
	}
}
