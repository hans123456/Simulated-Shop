import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import ui.MainFrame;


public class Driver {

	public static void main(String[] args) {
		
		JFrame frame = new MainFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		frame.setResizable(false);
		frame.setTitle("SHOPPING!");
		frame.setVisible(true);
	}
	
}
