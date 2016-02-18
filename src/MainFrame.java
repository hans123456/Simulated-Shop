

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainFrame extends JFrame{

	private JPanel container;
	
	public MainFrame(ShopDatabase shopdb) {
		container = new JPanel(new CardLayout());
		
		container.add(new LoginView(container, shopdb), "Login");
		container.add(new UserOrderScreen(container), "User Order Screen");
		
		getContentPane().add(container, BorderLayout.CENTER);
	}
}
