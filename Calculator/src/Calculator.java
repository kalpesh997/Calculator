import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class Calculator {

	private JFrame frame;
	private JTextField txtK;
	
	double firstno;
	double secondno;
	double result;
	String operation;
	String total;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtK = new JTextField();
		txtK.setBackground(SystemColor.activeCaption);
		txtK.setHorizontalAlignment(SwingConstants.RIGHT);
		txtK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtK.setBounds(10, 11, 414, 42);
		frame.getContentPane().add(txtK);
		txtK.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterno = txtK.getText() + btn1.getText();
				txtK.setText(enterno);
			}
		});
		
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 75, 61, 42);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String enterno = txtK.getText() + btn2.getText();
				txtK.setText(enterno);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(105, 75, 61, 42);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterno = txtK.getText() + btn3.getText();
				txtK.setText(enterno);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(198, 75, 61, 42);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterno = txtK.getText() + btn4.getText();
				txtK.setText(enterno);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(285, 75, 61, 42);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterno = txtK.getText() + btn5.getText();
				txtK.setText(enterno);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(363, 75, 61, 42);
		frame.getContentPane().add(btn5);
		
		
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstno = Double.parseDouble(txtK.getText());
				txtK.setText("");
				operation = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnplus.setBounds(10, 147, 156, 42);
		frame.getContentPane().add(btnplus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstno = Double.parseDouble(txtK.getText());
				txtK.setText("");
				operation = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMinus.setBounds(198, 147, 148, 42);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstno = Double.parseDouble(txtK.getText());
				txtK.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMul.setBounds(10, 208, 156, 42);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstno = Double.parseDouble(txtK.getText());
				txtK.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setBounds(198, 208, 148, 42);
		frame.getContentPane().add(btnDiv);
		
		JButton btnTotal = new JButton("=");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ans;
				secondno = Double.parseDouble(txtK.getText());
				if(operation == "+")
				{
					result = firstno + secondno;
					ans = String.format("%.2f", result);
					txtK.setText(ans);
				}
				
				else if(operation == "-")
				{
					result = firstno - secondno;
					ans = String.format("%.2f", result);
					txtK.setText(ans);
				}
				
				else if(operation == "*")
				{
					result = firstno * secondno;
					ans = String.format("%.2f", result);
					txtK.setText(ans);
				}
				else if(operation == "/")
				{
					result = firstno / secondno;
					ans = String.format("%.2f", result);
					txtK.setText(ans);
				}
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTotal.setBounds(363, 213, 61, 37);
		frame.getContentPane().add(btnTotal);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtK.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(363, 147, 61, 42);
		frame.getContentPane().add(btnClear);
	}
}
