package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JPanel{

	private JLabel userLabel;
	private JLabel pwLabel;
		
	private JButton loginButton;
	
	private JPasswordField pwField;
	
	private JTextField userTextField;
	
	public LoginView (){
		
		this.setLayout(null);
		
		userLabel = new JLabel("User: ");
		userLabel.setBounds(10, 40, 80, 25);
		
		pwLabel = new JLabel("Password: ");
		pwLabel.setBounds(10, 40, 80, 25);
		
		pwField = new JPasswordField(20);
		pwField.setBounds(100, 40, 160, 25);
		
		userTextField = new JTextField(20);
		userTextField.setBounds(100, 10, 160, 25);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 80, 25);
		
		this.add(userLabel);
		this.add(userTextField);
		this.add(pwLabel);
		this.add(pwField);
		this.add(loginButton);
	}

}