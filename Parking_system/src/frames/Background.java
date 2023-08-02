package frames;

import javax.swing.JFrame;

public class Background extends JFrame{
	
	public Background() {
	setLayout(null);
	//      Axis x,y width,height
	setBounds(100,30,400,500);
	setVisible(true);
	setLocationRelativeTo(null); // Centering Frame
	setResizable(false); // Can't change the dimentions
	}
}
