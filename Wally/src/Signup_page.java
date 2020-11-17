import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;

public class Signup_page {

	private JFrame frame;
	private JTextField txtName;
	private JTextField textField_1;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup_page window = new Signup_page();
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
	public Signup_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SignUp");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel.setBounds(265, 53, 380, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the following details...");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(247, 332, 339, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name :- ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(313, 96, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login Id :- ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(313, 133, 72, 18);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password :- ");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(313, 174, 72, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Salary :- ");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(313, 210, 72, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		txtName = new JTextField();
		txtName.setToolTipText("");
		txtName.setBounds(418, 96, 227, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(418, 133, 227, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(418, 208, 227, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(418, 172, 227, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
					Statement stmt = con.createStatement();
					String sql = "Insert into login_info values ('"+textField_1.getText()+"','"+passwordField.getText().toString()+"','"+txtName.getText()+"',"+textField_3.getText()+");";
					stmt.executeUpdate(sql);
					con.close();
				}catch(Exception e1) {System.out.print(e1);}
						frame.dispose();
						ss s1 = new ss();
						s1.NewScreen();
			}
		});
		btnNewButton.setBounds(336, 298, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(658, 298, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(0, 0, 944, 30);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Wally - Your Personal Tracker");
		lblNewLabel_6.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 18));
		lblNewLabel_6.setBounds(10, 11, 204, 14);
		panel.add(lblNewLabel_6);
	}
}
