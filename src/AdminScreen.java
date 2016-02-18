import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminScreen extends JFrame {

	private JPanel panel_;

	private JLabel productIdLabel_;
	private JLabel productNameLabel_;
	private JLabel costLabel_;
	private JLabel quantityLabel_;
	private JLabel typeLabel_;
	private JLabel powerUsageLabel_;
	private JLabel expiresAfterNDaysLabel_;

	private JTextField productIdTextField_;
	private JTextField productNameTextField_;
	private JTextField costTextField_;
	private JTextField quantityTextField_;
	private JTextField powerUsageTextField_;
	private JTextField expiresAfterNDaysTextField_;
	private JComboBox<String> typeComboBox_;
	private JButton addProductButton_;

	private GridBagLayout gbl1;
	private GridBagConstraints gbc1;
	private GridBagLayout gbl2;
	private GridBagConstraints gbc2;

	private ShopDatabase shopDB;

	public AdminScreen() {

		super("Admin Screen");

		panel_ = new JPanel();

		productIdLabel_ = new JLabel("Product ID : ");
		productNameLabel_ = new JLabel("Product Name : ");
		costLabel_ = new JLabel("Cost : ");
		quantityLabel_ = new JLabel("Quantity : ");
		typeLabel_ = new JLabel("Type : ");
		expiresAfterNDaysLabel_ = new JLabel("Expires N Days : ");
		powerUsageLabel_ = new JLabel("Power Usage : ");

		productIdTextField_ = new JTextField(12);
		productNameTextField_ = new JTextField(12);
		costTextField_ = new JTextField(12);
		quantityTextField_ = new JTextField(12);
		powerUsageTextField_ = new JTextField(12);
		expiresAfterNDaysTextField_ = new JTextField(12);
		addProductButton_ = new JButton("Add Product");

		typeComboBox_ = new JComboBox<String>();
		typeComboBox_.addItem("Generic");
		typeComboBox_.addItem("Electronic");
		typeComboBox_.addItem("Consumable");

		gbl1 = new GridBagLayout();
		gbc1 = new GridBagConstraints();
		gbl2 = new GridBagLayout();
		gbc2 = new GridBagConstraints();

		this.setLayout(gbl1);

		gbc1.insets = new Insets(10, 10, 10, 10);
		this.add(panel_, gbc1);

		panel_.setLayout(gbl2);

		gbc2.insets = new Insets(5, 5, 0, 5);
		gbc2.anchor = GridBagConstraints.WEST;
		gbc2.fill = GridBagConstraints.BOTH;

		gbc2.gridx = 0;
		gbc2.gridy = 0;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(productIdLabel_, gbc2);

		gbc2.gridx = 1;
		gbc2.gridy = 0;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(productIdTextField_, gbc2);

		gbc2.gridx = 0;
		gbc2.gridy = 1;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(productNameLabel_, gbc2);

		gbc2.gridx = 1;
		gbc2.gridy = 1;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(productNameTextField_, gbc2);

		gbc2.gridx = 0;
		gbc2.gridy = 2;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(costLabel_, gbc2);

		gbc2.gridx = 1;
		gbc2.gridy = 2;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(costTextField_, gbc2);

		gbc2.gridx = 0;
		gbc2.gridy = 3;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(quantityLabel_, gbc2);

		gbc2.gridx = 1;
		gbc2.gridy = 3;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(quantityTextField_, gbc2);

		gbc2.gridx = 0;
		gbc2.gridy = 4;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(typeLabel_, gbc2);

		gbc2.gridx = 1;
		gbc2.gridy = 4;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(typeComboBox_, gbc2);

		gbc2.gridx = 0;
		gbc2.gridy = 5;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(powerUsageLabel_, gbc2);

		gbc2.gridx = 1;
		gbc2.gridy = 5;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(powerUsageTextField_, gbc2);

		gbc2.gridx = 0;
		gbc2.gridy = 5;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(expiresAfterNDaysLabel_, gbc2);

		gbc2.gridx = 1;
		gbc2.gridy = 5;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(expiresAfterNDaysTextField_, gbc2);

		gbc2.gridx = 1;
		gbc2.gridy = 6;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		panel_.add(addProductButton_, gbc2);

		powerUsageLabel_.setVisible(false);
		powerUsageTextField_.setVisible(false);
		expiresAfterNDaysLabel_.setVisible(false);
		expiresAfterNDaysTextField_.setVisible(false);

		this.setResizable(false);
		this.pack();

		addProductButton_.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addProduct();
			}

		});

		typeComboBox_.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String item = (String) e.getItem();
				switch (item) {
				case "Generic":
					powerUsageLabel_.setVisible(false);
					powerUsageTextField_.setVisible(false);
					expiresAfterNDaysLabel_.setVisible(false);
					expiresAfterNDaysTextField_.setVisible(false);
					break;
				case "Electronic":
					powerUsageLabel_.setVisible(true);
					powerUsageTextField_.setVisible(true);
					expiresAfterNDaysLabel_.setVisible(false);
					expiresAfterNDaysTextField_.setVisible(false);
					break;
				case "Consumable":
					powerUsageLabel_.setVisible(false);
					powerUsageTextField_.setVisible(false);
					expiresAfterNDaysLabel_.setVisible(true);
					expiresAfterNDaysTextField_.setVisible(true);
					break;
				}
				pack();
			}
		});

	}

	private void addProduct() {

		if (shopDB.containsProductId(productIdTextField_.getText())) {
			JOptionPane.showMessageDialog(this, "Product ID already Exist.");
			return;
		}

		Product product = null;

		String productId = productIdTextField_.getText();
		String productName = productNameTextField_.getText();
		String cost = costTextField_.getText();
		String quantity = quantityTextField_.getText();
		String type = (String) typeComboBox_.getSelectedItem();
		String powerUsage = powerUsageTextField_.getText();
		String expiresAfterNDays = expiresAfterNDaysTextField_.getText();

		switch (type) {
		case "Generic":
			product = new GenericProduct(productId, productName, Integer.valueOf(cost), Integer.valueOf(quantity),
					type);
			break;
		case "Electronic":
			product = new ElectronicProduct(productId, productName, Integer.valueOf(cost), Integer.valueOf(quantity),
					type, Integer.valueOf(powerUsage));
			break;
		case "Consumable":
			product = new ConsumableProduct(productId, productName, Integer.valueOf(cost), Integer.valueOf(quantity),
					type, Integer.valueOf(expiresAfterNDays));
			break;
		}

		shopDB.addProduct(product);

	}

	public void setShopDB(ShopDatabase shopDB) {
		this.shopDB = shopDB;
	}

}
