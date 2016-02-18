

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UserOrderScreen extends JPanel {

	private JLabel currMoneyLabel;
	private JLabel moneyLabel;
	private JLabel prodIdLabel;
	private JLabel quantityLabel;
	
	private JTextField prodIdTextField;
	private JTextField quantityTextField;
	
	private JTable listTable;
	
	private JButton buyButton;
	
	private JScrollPane scrollPane;
	
	public UserOrderScreen(final JPanel container) {
		
		this.setLayout(null);
		
		moneyLabel = new JLabel("Current Money:");
		moneyLabel.setBounds(10, 10, 100, 25);
		
		currMoneyLabel = new JLabel("1000");
		currMoneyLabel.setBounds(100, 10, 80, 25);
		
		listTable = new JTable();
		
		scrollPane = new JScrollPane();
		scrollPane.add(listTable);
		scrollPane.setBounds(10, 50, 800, 300);
		
		prodIdLabel = new JLabel("Product Id:");
		prodIdLabel.setBounds(350, 10, 100, 25);

		prodIdTextField = new JTextField(20);
		prodIdTextField.setBounds(425, 10, 80, 25);
		
		quantityLabel = new JLabel("Quantity: ");
		quantityLabel.setBounds(600, 10, 100, 25);
		
		quantityTextField = new JTextField(20);
		quantityTextField.setBounds(670, 10, 80, 25);
		
		buyButton = new JButton("Buy");
		buyButton.setBounds(600, 400, 100, 25);
		
		this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		this.add(moneyLabel);
		this.add(currMoneyLabel);
		this.add(scrollPane);
		this.add(prodIdLabel);
		this.add(prodIdTextField);
		this.add(quantityLabel);
		this.add(quantityTextField);
		this.add(buyButton);
	}
			
	
}
