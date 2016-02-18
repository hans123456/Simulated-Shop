package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainFrame extends JFrame{

	private JPanel container;
	
	public MainFrame() {
		container = new JPanel(new CardLayout());
		
//		container.add(new LoginView(), "Login");
		container.add(new UserOrderScreen(), "User Order Screen");
		
		getContentPane().add(container, BorderLayout.CENTER);
	}
}
