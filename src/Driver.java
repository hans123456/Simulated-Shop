import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {

		ShopDatabase shopDB = new ShopDatabase();
		AdminScreen adminScreen = new AdminScreen();
		adminScreen.setShopDB(shopDB);
		adminScreen.setVisible(true);

		JFrame frame = new MainFrame(shopDB);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width,
				Toolkit.getDefaultToolkit().getScreenSize().height);
		frame.setResizable(false);
		frame.setTitle("SHOPPING!");
		frame.setVisible(true);
	}

}
