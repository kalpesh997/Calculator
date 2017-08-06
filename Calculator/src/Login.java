import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login {

	private JFrame frame;
	private JTextField Uname;
	private JPasswordField passwordField;
	private JPasswordField Pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(169, 24, 90, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(56, 110, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(57, 153, 61, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		Uname = new JTextField();
		Uname.setBounds(154, 107, 148, 20);
		frame.getContentPane().add(Uname);
		Uname.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 78, 361, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 201, 361, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname = Uname.getText();
				@SuppressWarnings("deprecation")
				String pass = Pass.getText();
				if(uname.contains("kalpesh") && pass.contains("123"))
				{
					Uname.setText(null);
					Pass.setText(null);					
					Calculator.main(null);					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalie Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					Uname.setText(null);
					Pass.setText(null);
				}
			}
		});
		btnNewButton.setBounds(154, 214, 118, 36);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(282, 156, -41, 14);
		frame.getContentPane().add(passwordField);
		
		Pass = new JPasswordField();
		Pass.setBounds(154, 150, 148, 20);
		frame.getContentPane().add(Pass);
	}
}
