//added

import java.sql.*;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ss extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterLoginId;
	private JPasswordField pwdAaaaaaaaaa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ss frame = new ss();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ss() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Password :- ");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(423, 189, 293, 20);
		contentPane.add(lblNewLabel_2);
		
		pwdAaaaaaaaaa = new JPasswordField();
		pwdAaaaaaaaaa.setText("aaaaaaaaaa");
		pwdAaaaaaaaaa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pwdAaaaaaaaaa.setText("");
			}
		});
		pwdAaaaaaaaaa.setForeground(new Color(255, 255, 255));
		pwdAaaaaaaaaa.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		pwdAaaaaaaaaa.setBorder(null);
		pwdAaaaaaaaaa.setBackground(new Color(25, 25, 112));
		pwdAaaaaaaaaa.setBounds(423, 219, 283, 20);
		contentPane.add(pwdAaaaaaaaaa);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(25, 25, 112));
		btnNewButton.setBackground(new Color(175, 238, 238));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
					Statement stmt = con.createStatement();
					String sql = "Select * from login_info where login_id = "+txtEnterLoginId.getText()+" and password="+pwdAaaaaaaaaa.getText().toString()+";";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Successful...");
						dispose();
						Login l1 = new Login();
						l1.NewScreen();
					}
					else
						JOptionPane.showMessageDialog(null, "Incorrect Login id or Password");
					con.close();
				}catch(Exception e1) {System.out.print(e1);}
				
			}
		});
		btnNewButton.setBounds(423, 317, 121, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBackground(new Color(175, 238, 238));
		btnNewButton_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnNewButton_1.setForeground(new Color(25, 25, 112));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(606, 317, 110, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Sign up");
		btnNewButton_3.setBackground(new Color(175, 238, 238));
		btnNewButton_3.setForeground(new Color(25, 25, 112));
		btnNewButton_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Signup_page sp1 = new Signup_page();
				sp1.NewScreen();
			}
		});
		btnNewButton_3.setBounds(627, 435, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 374, 484);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/wallylogo1.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img));
		lblNewLabel_4.setBounds(0, 159, 374, 130);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Track your bills like never before!!!");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(10, 410, 354, 53);
		panel.add(lblNewLabel_5);
		
		txtEnterLoginId = new JTextField();
		txtEnterLoginId.setText("Enter login Id");
		txtEnterLoginId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterLoginId.setText("");
			}
		});
		txtEnterLoginId.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEnterLoginId.setBorder(null);
		txtEnterLoginId.setForeground(new Color(255, 255, 255));
		txtEnterLoginId.setBackground(new Color(25, 25, 112));
		txtEnterLoginId.setBounds(423, 128, 283, 20);
		contentPane.add(txtEnterLoginId);
		txtEnterLoginId.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New User ?... ");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(521, 440, 96, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Login ID :- ");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_1.setBounds(423, 98, 283, 20);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(372, 49, 364, 29);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(423, 155, 283, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(423, 244, 283, 2);
		contentPane.add(separator_1);
	}

	public void NewScreen() {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ss frame = new ss();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
}