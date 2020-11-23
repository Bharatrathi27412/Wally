import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class dashboardBBB {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboardBBB window = new dashboardBBB();
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
	public dashboardBBB() {
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
		sidebar.setBackground(new Color(54, 33, 89));

		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		JPanel dashboardP = new JPanel();
		dashboardP.setBackground(new Color(54, 33, 89));
		dashboardP.setBounds(0, 169, 285, 59);
		sidebar.add(dashboardP);
		
		JLabel DashboardL = new JLabel();
		DashboardL.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/dashboard.png")).getImage();
		DashboardL.setIcon(new ImageIcon(img));
		DashboardL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
                dashboardP.setBackground(new Color(85,69,118));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
                dashboardP.setBackground(new Color(54,33,89));

			}
		});
		DashboardL.setText("Dashboard");
		DashboardL.setMinimumSize(new Dimension(97, 61));
		DashboardL.setMaximumSize(new Dimension(97, 61));
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
		AddExpenseP.setBackground(new Color(54, 33, 89));
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
		ExpenseListP.setBackground(new Color(54, 33, 89));
		ExpenseListP.setBounds(0, 311, 285, 59);
		sidebar.add(ExpenseListP);
		Image img2 = new ImageIcon(this.getClass().getResource("/list.png")).getImage();
		
		JLabel ExpenseListL = new JLabel();
		ExpenseListL.setIcon(new ImageIcon(img2));
		ExpenseListL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ExpenseListN e1 = new ExpenseListN();
				e1.NewScreen();
				frame.dispose();

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
				.addGroup(Alignment.TRAILING, gl_ExpenseListP.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addComponent(ExpenseListL, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_ExpenseListP.setVerticalGroup(
			gl_ExpenseListP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ExpenseListP.createSequentialGroup()
					.addComponent(ExpenseListL, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		ExpenseListP.setLayout(gl_ExpenseListP);
		
		JPanel AnalyticsP = new JPanel();
		AnalyticsP.setBackground(new Color(54, 33, 89));
		AnalyticsP.setBounds(0, 382, 285, 59);
		sidebar.add(AnalyticsP);
		Image img3 = new ImageIcon(this.getClass().getResource("/analytics.png")).getImage();
		
		JLabel AnalyticsL = new JLabel();
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
				.addGroup(gl_AnalyticsP.createSequentialGroup()
					.addContainerGap()
					.addComponent(AnalyticsL, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_AnalyticsP.setVerticalGroup(
			gl_AnalyticsP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AnalyticsP.createSequentialGroup()
					.addComponent(AnalyticsL, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		AnalyticsP.setLayout(gl_AnalyticsP);
		
		JLabel lblNewLabel = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/dashlogo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img4));
		lblNewLabel.setBounds(10, 50, 266, 59);
		sidebar.add(lblNewLabel);
		
		JPanel main_page = new JPanel();
		main_page.setBackground(Color.WHITE);
		main_page.setBounds(286, 0, 770, 708);
		frame.getContentPane().add(main_page);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		
		JLabel lblNewLabel_2 = new JLabel("INCOME");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("900000");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		
		JLabel lblNewLabel_1 = new JLabel("Dashboard");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		
		JSeparator separator = new JSeparator();
		
		JLabel account_name = new JLabel("Bharat Rathi");
		Image img5 = new ImageIcon(this.getClass().getResource("/account.png")).getImage();
		account_name.setIcon(new ImageIcon(img5));


		account_name.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_1 = new JLabel("EXPENSES");
		lblNewLabel_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("900000");
		lblNewLabel_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 153, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addGap(9))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 90, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_2 = new JLabel("SAVINGS");
		lblNewLabel_2_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_2 = new JLabel("900000");
		lblNewLabel_3_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 153, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addGap(9))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 90, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel_3.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_3 = new JLabel("DEPOSIT");
		lblNewLabel_2_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_3 = new JLabel("900000");
		lblNewLabel_3_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 153, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addGap(9))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 90, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_main_page = new GroupLayout(main_page);
		gl_main_page.setHorizontalGroup(
			gl_main_page.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_main_page.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addGap(417)
					.addComponent(account_name, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 770, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_main_page.createSequentialGroup()
					.addGap(26)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
		);
		gl_main_page.setVerticalGroup(
			gl_main_page.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_main_page.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_main_page.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_main_page.createSequentialGroup()
							.addGap(4)
							.addComponent(account_name, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addGroup(gl_main_page.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addGap(9))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
		main_page.setLayout(gl_main_page);
	}

}
