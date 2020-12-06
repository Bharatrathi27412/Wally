import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class ExpenseListN {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpenseListN window = new ExpenseListN();
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
	public ExpenseListN() {
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
		DashboardC.setOpaque(false);
		DashboardC.setForeground(Color.CYAN);
		DashboardC.setLayout(null);
		DashboardC.setPreferredSize(new Dimension(3, 61));
		DashboardC.setMinimumSize(new Dimension(3, 61));
		DashboardC.setBackground(Color.CYAN);

		
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
              //  DashboardC.setOpaque(true);

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
		AddExpenseP.setBackground(new Color(18, 18, 18));
		
		JPanel AddExpenseC = new JPanel();
		AddExpenseC.setOpaque(false);
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
			//	AddExpenseC.setOpaque(true);
				
				AddExpenseN a1 = new AddExpenseN();
				a1.NewScreen();
				frame.dispose();


			}
			@Override
			public void mouseEntered(MouseEvent e) {
                AddExpenseP.setBackground(new Color(41,57,80));

			}
			@Override
			public void mouseExited(MouseEvent e) {
                AddExpenseP.setBackground(new Color(18,18,18));

			}
		});
		AddExpenseL.setText("Add Expense");
		AddExpenseL.setMinimumSize(new Dimension(97, 61));
		AddExpenseL.setMaximumSize(new Dimension(97, 61));
		AddExpenseL.setHorizontalAlignment(SwingConstants.CENTER);
		AddExpenseL.setForeground(Color.WHITE);
		AddExpenseL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		
		
		JPanel ExpenseListP = new JPanel();
		ExpenseListP.setBackground(new Color(41,57,80));
		
		JPanel ExpenseListC = new JPanel();
		ExpenseListC.setOpaque(true);
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

			}
			@Override
			public void mouseEntered(MouseEvent e) {
				ExpenseListP.setBackground(new Color(41,57,80));

			}
			@Override
			public void mouseExited(MouseEvent e) {
               // ExpenseListP.setBackground(new Color(18,18,18));

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
			//	AnalyticsC.setOpaque(true);
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

		
		/*JPanel sidebar = new JPanel();
		sidebar.setBounds(0, 0, 286, 708);
		sidebar.setBackground(new Color(18, 18, 18));

		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		JPanel dashboardP = new JPanel();
		dashboardP.setBackground(new Color(18, 18, 18));
		dashboardP.setBounds(0, 169, 285, 59);
		sidebar.add(dashboardP);
		
		JLabel DashboardL = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/dashboard.png")).getImage();
		DashboardL.setIcon(new ImageIcon(img));
		DashboardL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
                dashboardP.setBackground(new Color(85,69,118));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dashboardBBB d1= new dashboardBBB();
				d1.NewScreen();
				frame.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
                dashboardP.setBackground(new Color(54,33,89));

			}
		});
		DashboardL.setText("Dashboard");
		DashboardL.setMinimumSize(new Dimension(97, 61));
		DashboardL.setMaximumSize(new Dimension(97, 61));
		DashboardL.setHorizontalAlignment(SwingConstants.CENTER);
		DashboardL.setForeground(Color.WHITE);
		DashboardL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		GroupLayout gl_dashboardP = new GroupLayout(dashboardP);
		gl_dashboardP.setHorizontalGroup(
			gl_dashboardP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 310, Short.MAX_VALUE)
				.addComponent(DashboardL, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
		);
		gl_dashboardP.setVerticalGroup(
			gl_dashboardP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addComponent(DashboardL, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
		);
		dashboardP.setLayout(gl_dashboardP);
		
		JPanel AddExpenseP = new JPanel();
		AddExpenseP.setBackground(new Color(18, 18, 18));
		AddExpenseP.setBounds(0, 240, 285, 59);
		sidebar.add(AddExpenseP);
		
		JLabel AddExpenseL = new JLabel();
		Image img1 = new ImageIcon(this.getClass().getResource("/addexpense.png")).getImage();
		AddExpenseL.setIcon(new ImageIcon(img1));
		AddExpenseL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddExpenseN a1 = new AddExpenseN();
				a1.NewScreen();
				frame.dispose();


			}
			@Override
			public void mouseEntered(MouseEvent e) {
                AddExpenseP.setBackground(new Color(85,69,118));

			}
			@Override
			public void mouseExited(MouseEvent e) {
                AddExpenseP.setBackground(new Color(54,33,89));

			}
		});
		AddExpenseL.setText("Add Expense");
		AddExpenseL.setMinimumSize(new Dimension(97, 61));
		AddExpenseL.setMaximumSize(new Dimension(97, 61));
		AddExpenseL.setHorizontalAlignment(SwingConstants.CENTER);
		AddExpenseL.setForeground(Color.WHITE);
		AddExpenseL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		GroupLayout gl_AddExpenseP = new GroupLayout(AddExpenseP);
		gl_AddExpenseP.setHorizontalGroup(
			gl_AddExpenseP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 285, Short.MAX_VALUE)
				.addGap(0, 310, Short.MAX_VALUE)
				.addComponent(AddExpenseL, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
		);
		gl_AddExpenseP.setVerticalGroup(
			gl_AddExpenseP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGap(0, 59, Short.MAX_VALUE)
				.addComponent(AddExpenseL, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
		);
		AddExpenseP.setLayout(gl_AddExpenseP);
		
		JPanel ExpenseListP = new JPanel();
		ExpenseListP.setBackground(new Color(18, 18, 18));
		ExpenseListP.setBounds(0, 311, 285, 59);
		sidebar.add(ExpenseListP);
		
		JLabel ExpenseListL = new JLabel();
		Image img2 = new ImageIcon(this.getClass().getResource("/list.png")).getImage();
		ExpenseListL.setIcon(new ImageIcon(img2));
		ExpenseListL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
			@Override
			public void mouseEntered(MouseEvent e) {
                ExpenseListP.setBackground(new Color(85,69,118));

			}
			@Override
			public void mouseExited(MouseEvent e) {
                ExpenseListP.setBackground(new Color(54,33,89));

			}
		});
		ExpenseListL.setText("Expense List");
		ExpenseListL.setMinimumSize(new Dimension(97, 61));
		ExpenseListL.setMaximumSize(new Dimension(97, 61));
		ExpenseListL.setHorizontalAlignment(SwingConstants.CENTER);
		ExpenseListL.setForeground(Color.WHITE);
		ExpenseListL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		GroupLayout gl_ExpenseListP = new GroupLayout(ExpenseListP);
		gl_ExpenseListP.setHorizontalGroup(
			gl_ExpenseListP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 285, Short.MAX_VALUE)
				.addGap(0, 310, Short.MAX_VALUE)
				.addComponent(ExpenseListL, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
		);
		gl_ExpenseListP.setVerticalGroup(
			gl_ExpenseListP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGap(0, 59, Short.MAX_VALUE)
				.addComponent(ExpenseListL, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
		);
		ExpenseListP.setLayout(gl_ExpenseListP);
		
		JPanel AnalyticsP = new JPanel();
		AnalyticsP.setBackground(new Color(18, 18, 18));
		AnalyticsP.setBounds(0, 382, 285, 59);
		sidebar.add(AnalyticsP);
		
		JLabel AnalyticsL = new JLabel();
		Image img3 = new ImageIcon(this.getClass().getResource("/analytics.png")).getImage();
		AnalyticsL.setIcon(new ImageIcon(img3));
		AnalyticsL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnalyticsN reports = new AnalyticsN();
				reports.NewScreen();
				frame.dispose();

			}
			@Override
			public void mouseEntered(MouseEvent e) {
                AnalyticsP.setBackground(new Color(85,69,118));

			}
			@Override
			public void mouseExited(MouseEvent e) {
                AnalyticsP.setBackground(new Color(54,33,89));

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
			gl_AnalyticsP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 285, Short.MAX_VALUE)
				.addGap(0, 310, Short.MAX_VALUE)
				.addComponent(AnalyticsL, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
		);
		gl_AnalyticsP.setVerticalGroup(
			gl_AnalyticsP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGap(0, 59, Short.MAX_VALUE)
				.addComponent(AnalyticsL, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
		);
		AnalyticsP.setLayout(gl_AnalyticsP);
		
		JLabel lblNewLabel = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/dashlogon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img4));
		lblNewLabel.setBounds(10, 50, 266, 59);
		sidebar.add(lblNewLabel);*/
		
		JPanel main_page = new JPanel();
		main_page.setLayout(null);
		main_page.setBackground(new Color(34,40,44));
		main_page.setBounds(286, 0, 770, 708);
		frame.getContentPane().add(main_page);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.setBounds(126, 49, 143, 47);
		main_page.add(dateChooser);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		
		JButton btnLoadExpenseList = new JButton("Load Expense List");
		btnLoadExpenseList.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnLoadExpenseList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
					String sql = "select EXPENSE_ID, CATEGORY_NAME, ITEM_NAME, AMOUNT, EXP_DATE, DESCRIPTION from expense_list where EXP_DATE like '"+((JTextField)dateChooser.getDateEditor().getUiComponent()).getText()+"';";
					PreparedStatement pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		btnLoadExpenseList.setBounds(454, 49, 170, 47);
		main_page.add(btnLoadExpenseList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.GRAY);
		scrollPane.setBounds(55, 166, 662, 458);
		main_page.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.PINK);
		scrollPane.setViewportView(table);
		
		
	}
}
