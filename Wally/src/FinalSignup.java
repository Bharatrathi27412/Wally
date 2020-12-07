import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinalSignup {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalSignup window = new FinalSignup();
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
	public FinalSignup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 859, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 399, 512);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/wallylogo1.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 184, 379, 130);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Track your bills like never before!!!");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(22, 435, 354, 53);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setBounds(397, 0, 446, 512);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sign Up");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(25, 25, 112));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(170, 57, 134, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Name :- ");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(SystemColor.menu);
		lblName.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblName.setBounds(58, 106, 100, 29);
		panel_1.add(lblName);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		textField.setText("Name here");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(25, 25, 112));
		textField.setBounds(89, 146, 291, 20);
		panel_1.add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(89, 167, 291, 10);
		panel_1.add(separator);
		
		JLabel lblPassword = new JLabel("Login ID :- ");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(SystemColor.menu);
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPassword.setBounds(58, 188, 103, 29);
		panel_1.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_1.setText("");
			}
		});
		textField_1.setText("Preferred Login Id");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(25, 25, 112));
		textField_1.setBounds(89, 236, 291, 20);
		panel_1.add(textField_1);
		
		JLabel lblPassword_1 = new JLabel("Password :- ");
		lblPassword_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_1.setForeground(SystemColor.menu);
		lblPassword_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPassword_1.setBounds(58, 269, 103, 29);
		panel_1.add(lblPassword_1);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				passwordField.setText("");
			}
		});
		passwordField.setText("Password");
		passwordField.setForeground(Color.WHITE);
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(25, 25, 112));
		passwordField.setBounds(92, 309, 291, 20);
		panel_1.add(passwordField);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(92, 330, 291, 10);
		panel_1.add(separator_2);
		
		JLabel lblSalary = new JLabel("Salary :- \r\n");
		lblSalary.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalary.setForeground(SystemColor.menu);
		lblSalary.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblSalary.setBounds(61, 350, 100, 29);
		panel_1.add(lblSalary);
		
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_2.setText("");
			}
		});
		textField_2.setText("Amount");
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(25, 25, 112));
		textField_2.setBounds(92, 390, 291, 20);
		panel_1.add(textField_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(92, 411, 291, 10);
		panel_1.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(89, 259, 291, 10);
		panel_1.add(separator_4);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
					Statement stmt = con.createStatement();
					String sql = "Insert into login_info values ('"+textField_1.getText()+"','"+passwordField.getText().toString()+"','"+textField.getText()+"',"+textField_2.getText()+");";
					stmt.executeUpdate(sql);
					con.close();
				}catch(Exception e1) {System.out.print(e1);}
						frame.dispose();
						ss s1 = new ss();
						s1.NewScreen();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 205));
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(175, 238, 238));
		btnNewButton.setBounds(89, 477, 108, 23);
		panel_1.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ss s2 = new ss();
				s2.NewScreen();
				frame.dispose();
			}
		});
		btnCancel.setForeground(new Color(0, 0, 205));
		btnCancel.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnCancel.setBackground(new Color(175, 238, 238));
		btnCancel.setBounds(272, 478, 108, 23);
		panel_1.add(btnCancel);
		

	}
}
