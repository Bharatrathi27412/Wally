import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class updateIncome extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateIncome frame = new updateIncome();
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
	public updateIncome() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 342, 249);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(18,18,18));
		panel.setBounds(0, 0, 342, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		setLocationRelativeTo(null);

		
		JLabel lblNewLabel = new JLabel("NEW SALARY :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 34, 114, 30);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("110000");
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setBounds(30, 79, 291, 36);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("CHANGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
					Statement stmt = con.createStatement();
					String sql = "update login_info set salary = " +textField.getText()+ " where login_id = 'Bharat1';";
					stmt.executeUpdate(sql);
					con.close();
				}catch(Exception e1) {System.out.print(e1);}
				JOptionPane.showMessageDialog(contentPane, "Salary successfully changed");
				dispose();
			}
		});
		btnNewButton.setBounds(116, 149, 117, 29);
		panel.add(btnNewButton);
	}
}
