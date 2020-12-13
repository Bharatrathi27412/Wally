import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AddExpenseN {

	private JFrame frame;
	private JTextField textField_itemname;
	private JTextField textField_amount;
	private JTextField textField_description;

	/**
	 * Launch the application.
	 */
		public static void NewScreen() {
				EventQueue.invokeLater(new Runnable() {
		 			public void run() {
						try {
							AddExpenseN window = new AddExpenseN();
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
	public AddExpenseN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1056, 730);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel sidebar = new JPanel();
		sidebar.setBounds(0, 0, 286, 708);
		sidebar.setBackground(new Color(18, 18, 18));

		frame.getContentPane().add(sidebar);
		
		JPanel dashboardP = new JPanel();
		dashboardP.setBackground(new Color(18, 18, 18));
		
		JPanel DashboardC = new JPanel();
		DashboardC.setForeground(Color.CYAN);
		DashboardC.setLayout(null);
		DashboardC.setPreferredSize(new Dimension(3, 61));
		DashboardC.setMinimumSize(new Dimension(3, 61));
		DashboardC.setBackground(Color.CYAN);
		DashboardC.setOpaque(false);

		
		JLabel DashboardL = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/dashboard.png")).getImage();
		DashboardL.setIcon(new ImageIcon(img));
		DashboardL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
                dashboardP.setBackground(new Color(41,57,80));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
               // dashboardP.setBackground(new Color(41,57,80));
               // DashboardC.setOpaque(true);

				dashboardBBB d1= new dashboardBBB();
				d1.NewScreen();
				frame.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
                dashboardP.setBackground(new Color(18,18,18));

			}
		});
		DashboardL.setText("Dashboard");
		DashboardL.setMinimumSize(new Dimension(97, 61));
		DashboardL.setMaximumSize(new Dimension(97, 61));
		DashboardL.setHorizontalAlignment(SwingConstants.CENTER);
		DashboardL.setForeground(Color.WHITE);
		DashboardL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		
		
		JPanel AddExpenseP = new JPanel();
		AddExpenseP.setBackground(new Color(41, 57, 80));
		
		JPanel AddExpenseC = new JPanel();
		AddExpenseC.setOpaque(true);
		AddExpenseC.setBackground(Color.CYAN);
		AddExpenseC.setMinimumSize(new Dimension(3, 61));
		AddExpenseC.setPreferredSize(new Dimension(3, 61));
		AddExpenseC.setLayout(null);

		
		JLabel AddExpenseL = new JLabel();
		Image img1 = new ImageIcon(this.getClass().getResource("/addexpense.png")).getImage();
		AddExpenseL.setIcon(new ImageIcon(img1));
		AddExpenseL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//AddExpenseP.setBackground(new Color(41,57,80));
				//AddExpenseC.setOpaque(true);

			}
			@Override
			public void mouseEntered(MouseEvent e) {
                AddExpenseP.setBackground(new Color(41,57,80));

			}
			@Override
			public void mouseExited(MouseEvent e) {
               // AddExpenseP.setBackground(new Color(18,18,18));

			}
		});
		AddExpenseL.setText("Add Expense");
		AddExpenseL.setMinimumSize(new Dimension(97, 61));
		AddExpenseL.setMaximumSize(new Dimension(97, 61));
		AddExpenseL.setHorizontalAlignment(SwingConstants.CENTER);
		AddExpenseL.setForeground(Color.WHITE);
		AddExpenseL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		
		
		JPanel ExpenseListP = new JPanel();
		ExpenseListP.setBackground(new Color(18,18,18));
		
		JPanel ExpenseListC = new JPanel();
		ExpenseListC.setOpaque(false);
		ExpenseListC.setLayout(null);
		ExpenseListC.setPreferredSize(new Dimension(3, 61));
		ExpenseListC.setMinimumSize(new Dimension(3, 61));
		ExpenseListC.setBackground(Color.CYAN);

		
		JLabel ExpenseListL = new JLabel();
		Image img2 = new ImageIcon(this.getClass().getResource("/list.png")).getImage();
		ExpenseListL.setIcon(new ImageIcon(img2));
		ExpenseListL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//ExpenseListP.setBackground(new Color(41,57,80));
				//ExpenseListC.setOpaque(true);

				ExpenseListN e1= new ExpenseListN();
				e1.NewScreen();
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				ExpenseListP.setBackground(new Color(41,57,80));

			}
			@Override
			public void mouseExited(MouseEvent e) {
                ExpenseListP.setBackground(new Color(18,18,18));

			}
		});
		ExpenseListL.setText("Expense List");
		ExpenseListL.setMinimumSize(new Dimension(97, 61));
		ExpenseListL.setMaximumSize(new Dimension(97, 61));
		ExpenseListL.setHorizontalAlignment(SwingConstants.CENTER);
		ExpenseListL.setForeground(Color.WHITE);
		ExpenseListL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		
		JPanel AnalyticsP = new JPanel();
		AnalyticsP.setBackground(new Color(18, 18, 18));
		
		JPanel AnalyticsC = new JPanel();
		AnalyticsC.setOpaque(false);
		AnalyticsC.setLayout(null);
		AnalyticsC.setPreferredSize(new Dimension(3, 61));
		AnalyticsC.setMinimumSize(new Dimension(3, 61));
		AnalyticsC.setBackground(Color.CYAN);

		
		JLabel AnalyticsL = new JLabel();
		Image img3 = new ImageIcon(this.getClass().getResource("/analytics.png")).getImage();
		AnalyticsL.setIcon(new ImageIcon(img3));
		AnalyticsL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//AnalyticsP.setBackground(new Color(41,57,80));
				//AnalyticsC.setOpaque(true);
				AnalyticsN reports= new AnalyticsN();
				reports.NewScreen();
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				AnalyticsP.setBackground(new Color(41,57,80));


			}
			@Override
			public void mouseExited(MouseEvent e) {
                AnalyticsP.setBackground(new Color(18,18,18));

			}
		});
		AnalyticsL.setText("Analytics");
		AnalyticsL.setMinimumSize(new Dimension(97, 61));
		AnalyticsL.setMaximumSize(new Dimension(97, 61));
		AnalyticsL.setHorizontalAlignment(SwingConstants.CENTER);
		AnalyticsL.setForeground(Color.WHITE);
		AnalyticsL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		
		GroupLayout gl_AnalyticsP = new GroupLayout(AnalyticsP);
		gl_AnalyticsP.setHorizontalGroup(
			gl_AnalyticsP.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_AnalyticsP.createSequentialGroup()
					.addComponent(AnalyticsC, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(AnalyticsL, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
		);
		gl_AnalyticsP.setVerticalGroup(
			gl_AnalyticsP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AnalyticsP.createSequentialGroup()
					.addGroup(gl_AnalyticsP.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(AnalyticsL, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(AnalyticsC, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE))
					.addContainerGap())
		);
		AnalyticsP.setLayout(gl_AnalyticsP);
		
		JLabel lblNewLabel = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/dashlogon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img4));
		GroupLayout gl_sidebar = new GroupLayout(sidebar);
		gl_sidebar.setHorizontalGroup(
			gl_sidebar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sidebar.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel))
				.addGroup(gl_sidebar.createSequentialGroup()
					.addComponent(AnalyticsP, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_sidebar.createParallelGroup(Alignment.TRAILING, false)
					.addComponent(dashboardP, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(AddExpenseP, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(ExpenseListP, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 285, Short.MAX_VALUE))
		);
		gl_sidebar.setVerticalGroup(
			gl_sidebar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sidebar.createSequentialGroup()
					.addGap(50)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(60)
					.addComponent(dashboardP, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(AddExpenseP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(ExpenseListP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(AnalyticsP, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(256))
		);
		
		GroupLayout gl_ExpenseListP = new GroupLayout(ExpenseListP);
		gl_ExpenseListP.setHorizontalGroup(
			gl_ExpenseListP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ExpenseListP.createSequentialGroup()
					.addComponent(ExpenseListC, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(ExpenseListL, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_ExpenseListP.setVerticalGroup(
			gl_ExpenseListP.createParallelGroup(Alignment.LEADING)
				.addComponent(ExpenseListL, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
				.addComponent(ExpenseListC, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
		);
		ExpenseListP.setLayout(gl_ExpenseListP);
		GroupLayout gl_AddExpenseP = new GroupLayout(AddExpenseP);
		gl_AddExpenseP.setHorizontalGroup(
			gl_AddExpenseP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AddExpenseP.createSequentialGroup()
					.addComponent(AddExpenseC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(AddExpenseL, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
		);
		gl_AddExpenseP.setVerticalGroup(
			gl_AddExpenseP.createParallelGroup(Alignment.LEADING)
				.addComponent(AddExpenseC, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
				.addComponent(AddExpenseL, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
		);
		AddExpenseP.setLayout(gl_AddExpenseP);
		GroupLayout gl_dashboardP = new GroupLayout(dashboardP);
		gl_dashboardP.setHorizontalGroup(
			gl_dashboardP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dashboardP.createSequentialGroup()
					.addComponent(DashboardC, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(DashboardL, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
		);
		gl_dashboardP.setVerticalGroup(
			gl_dashboardP.createParallelGroup(Alignment.LEADING)
				.addComponent(DashboardL, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
				.addComponent(DashboardC, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
		);
		dashboardP.setLayout(gl_dashboardP);
		sidebar.setLayout(gl_sidebar);
		
		JPanel main_page = new JPanel();
		main_page.setLayout(null);
		main_page.setBackground(new Color(34, 40, 44));
		main_page.setBounds(284, 0, 770, 708);
		frame.getContentPane().add(main_page);
		
		JLabel lbl_addexpense = new JLabel("Add Expense");
		lbl_addexpense.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lbl_addexpense.setForeground(new Color(255, 255, 255));
		lbl_addexpense.setBounds(335, 58, 115, 34);
		main_page.add(lbl_addexpense);
		
		JLabel lbl_itemname = new JLabel("Item name :");
		lbl_itemname.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_itemname.setForeground(new Color(255, 255, 255));
		lbl_itemname.setBounds(100, 160, 130, 13);
		main_page.add(lbl_itemname);
		
		JLabel lbl_amount = new JLabel("Amount :");
		lbl_amount.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_amount.setForeground(new Color(255, 255, 255));
		lbl_amount.setBounds(100, 243, 130, 13);
		main_page.add(lbl_amount);
		
		JLabel lbl_description = new JLabel("Description :");
		lbl_description.setForeground(new Color(255, 255, 255));
		lbl_description.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_description.setBounds(100, 342, 130, 21);
		main_page.add(lbl_description);
		
		JLabel lbl_category = new JLabel("Category :");
		lbl_category.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_category.setForeground(new Color(255, 255, 255));
		lbl_category.setBounds(100, 426, 130, 21);
		main_page.add(lbl_category);
		
		JLabel lbl_date = new JLabel("Date :");
		lbl_date.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_date.setForeground(new Color(255, 255, 255));
		lbl_date.setBounds(100, 514, 130, 13);
		main_page.add(lbl_date);
		
		JComboBox comboBox_category = new JComboBox();
		comboBox_category.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		comboBox_category.setModel(new DefaultComboBoxModel(new String[] {"", "Utilities", "Subscription", "Rent/Emi", "Shopping", "Travel", "Health", "Others"}));
		comboBox_category.setBounds(100, 458, 350, 21);
		main_page.add(comboBox_category);
		
		textField_itemname = new JTextField();
		textField_itemname.setForeground(Color.WHITE);
		textField_itemname.setBorder(null);
		textField_itemname.setBackground(new Color(34, 40, 44));
		textField_itemname.setBounds(100, 184, 350, 19);
		main_page.add(textField_itemname);
		textField_itemname.setColumns(10);
		
		textField_amount = new JTextField("");
		textField_amount.setForeground(Color.WHITE);
		textField_amount.setBorder(null);
		textField_amount.setBackground(new Color(34, 40, 44));
		textField_amount.setBounds(100, 267, 350, 21);
		main_page.add(textField_amount);
		textField_amount.setColumns(10);
		
		textField_description = new JTextField();
		textField_description.setForeground(Color.WHITE);
		textField_description.setBackground(new Color(34, 40, 44));
		textField_description.setBorder(null);
		textField_description.setBounds(100, 374, 350, 19);
		main_page.add(textField_description);
		textField_description.setColumns(10);
		
		JDateChooser dateChooser_date = new JDateChooser();
		dateChooser_date.setBounds(100, 537, 139, 19);
		main_page.add(dateChooser_date);
		dateChooser_date.setDateFormatString("yyyy-MM-dd");
		
		JButton btn_enterb = new JButton("Add");
		btn_enterb.setBackground(new Color(175, 238, 238));
		btn_enterb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dateChooser_date.getDateEditor().toString().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please select appropriate date",null, JOptionPane.ERROR_MESSAGE);
					
				}else if(textField_amount.getText().toString().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Enter amount", "error", JOptionPane.ERROR_MESSAGE);
				}else if(textField_itemname.getText().toString().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter item name",null, JOptionPane.ERROR_MESSAGE);
				}
				else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
					Statement stmt = con.createStatement();
					String sql = "Insert into expense_list (category_name,item_name,amount,exp_date,description) values ('"+comboBox_category.getSelectedItem().toString()+"','"+textField_itemname.getText()+"','"+textField_amount.getText()+"','"+((JTextField)dateChooser_date.getDateEditor().getUiComponent()).getText()+"','"+textField_description.getText()+"')";
					stmt.executeUpdate(sql);
					con.close();
				}catch(Exception e1) {System.out.print(e1);}
						frame.dispose();
						dashboardBBB db2 = new dashboardBBB();
						db2.NewScreen();
			}}
		});
		btn_enterb.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btn_enterb.setBounds(219, 623, 85, 21);
		main_page.add(btn_enterb);
		
		JButton btn_cancel = new JButton("Cancel");
		btn_cancel.setBackground(new Color(175, 238, 238));
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboardBBB d2 = new dashboardBBB();
				d2.NewScreen();
				frame.dispose();
			}
		});
		btn_cancel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btn_cancel.setBounds(443, 623, 85, 21);
		main_page.add(btn_cancel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(100, 211, 350, 2);
		main_page.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(100, 396, 350, 2);
		main_page.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(100, 293, 350, 2);
		main_page.add(separator_2);
	}
}
