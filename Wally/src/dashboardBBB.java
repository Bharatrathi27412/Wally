import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
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

import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

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
		sidebar.setBackground(new Color(18, 18, 18));

		frame.getContentPane().add(sidebar);
		
		JPanel dashboardP = new JPanel();
		dashboardP.setBackground(new Color(41, 57, 80));
		
		JPanel DashboardC = new JPanel();
		DashboardC.setLayout(null);
		DashboardC.setPreferredSize(new Dimension(3, 61));
		DashboardC.setMinimumSize(new Dimension(3, 61));
		DashboardC.setBackground(Color.CYAN);
		DashboardC.setOpaque(true);
		

		
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
                //dashboardP.setBackground(new Color(41,57,80));
              //  DashboardC.setOpaque(true);

			}
			@Override
			public void mouseExited(MouseEvent e) {
                //dashboardP.setBackground(new Color(18,18,18));

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
				//AddExpenseC.setOpaque(true);
				
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
			//	ExpenseListC.setOpaque(true);

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

		
		/*JPanel sidebar = new JPanel();
		sidebar.setBounds(0, 0, 286, 708);
		//sidebar.setBackground(new Color(54, 36, 89));
		sidebar.setBackground(new Color(18, 18, 18));


		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		JPanel dashboardP = new JPanel();
		//dashboardP.setBackground(new Color(54, 33, 89));
		dashboardP.setBackground(new Color(18, 18, 18));

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
		//AddExpenseP.setBackground(new Color(54, 33, 89));
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
		//ExpenseListP.setBackground(new Color(54, 33, 89));
		ExpenseListP.setBackground(new Color(18, 18, 18));

		
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
			gl_ExpenseListP.createParallelGroup(Alignment.TRAILING)
				.addComponent(ExpenseListL, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
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
		AnalyticsP.setBackground(new Color(18, 18, 18));

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
				.addComponent(AnalyticsL, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
		);
		gl_AnalyticsP.setVerticalGroup(
			gl_AnalyticsP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AnalyticsP.createSequentialGroup()
					.addComponent(AnalyticsL, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		AnalyticsP.setLayout(gl_AnalyticsP);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img4 = new ImageIcon(this.getClass().getResource("/dashlogon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img4));
		lblNewLabel.setBounds(19, 51, 266, 59);
		sidebar.add(lblNewLabel);*/
		
		JPanel main_page = new JPanel();
		main_page.setBackground(new Color(34,40,44));
		main_page.setBounds(286, 0, 770, 708);
		frame.getContentPane().add(main_page);
		
		JLabel lblNewLabel_1 = new JLabel("Dashboard");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		
		JLabel account_name = new JLabel("Bharat Rathi");
		account_name.setForeground(Color.WHITE);
		Image img5 = new ImageIcon(this.getClass().getResource("/account.png")).getImage();
		account_name.setIcon(new ImageIcon(img5));


		account_name.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateIncome ui1 = new updateIncome();
				ui1.NewScreen();
			}
		});
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(44, 52, 58), 1, true));
		panel_4.setBackground(new Color(44,52,58));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
			Statement stmt = con.createStatement();
			String sql = "select distinct(category_name) as Category, sum(amount) as Amount from expense_list where exp_date = curdate() group by category_name;";
			JDBCCategoryDataset dataset = new JDBCCategoryDataset(con,sql);
			
			con.close();
			JFreeChart chart = ChartFactory.createBarChart("Query Chart", "Category", "Amount", dataset, PlotOrientation.HORIZONTAL, false, true, true);
			BarRenderer renderer = null;
			CategoryPlot plot = null;
			renderer = new BarRenderer ();
			ChartFrame frame = new ChartFrame("Line Graph",chart);
			//frame.setVisible(true);
			//frame.setSize(400, 650);
			
			ChartPanel barpanel = new ChartPanel(chart);
			panel_4.removeAll();
			panel_4.add(barpanel,BorderLayout.CENTER);
			panel_4.validate();	
			
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(null,e1);
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(44,52,58));
		panel.setForeground(Color.MAGENTA);
		panel.setBorder(new LineBorder(new Color(44,52,58), 1, true));
		
		JLabel lblNewLabel_2 = new JLabel("INCOME");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("80000");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(44,52,58), 1, true));
		panel_1.setBackground(new Color(44,52,58));
		
		JLabel lblNewLabel_2_1 = new JLabel("EXPENSES");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("65000");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
				.addComponent(lblNewLabel_3_1, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		panel_1.setLayout(gl_panel_1);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(44,52,58), 1, true));
		panel_2.setBackground(new Color(44,52,58));
		
		JLabel lblNewLabel_2_2 = new JLabel("SAVINGS");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_2 = new JLabel("15000");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_3_2, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
				.addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(44,52,58), 1, true));
		panel_3.setBackground(new Color(44,52,58));
		
		JLabel lblNewLabel_2_3 = new JLabel("BUDGET");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_3 = new JLabel("50000");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_3_3, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		panel_3.setLayout(gl_panel_3);
		
		JSeparator separator = new JSeparator();
		//separator.setForeground(new Color(187, 134, 252));
		separator.setForeground(new Color(3, 218, 197));


		//panel_5.setBackground(new Color(64,55,92));
		
		
		
		GroupLayout gl_main_page = new GroupLayout(main_page);
		gl_main_page.setHorizontalGroup(
			gl_main_page.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_main_page.createSequentialGroup()
					.addGroup(gl_main_page.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_main_page.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_main_page.createSequentialGroup()
								.addGap(26)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(account_name, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
							.addComponent(separator, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 769, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_main_page.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_main_page.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 701, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_main_page.createSequentialGroup()
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_main_page.createSequentialGroup()
							.addGap(74)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_main_page.setVerticalGroup(
			gl_main_page.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_main_page.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_main_page.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(account_name, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_main_page.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(37)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
					.addGap(43))
		);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		main_page.setLayout(gl_main_page);
	}
}
