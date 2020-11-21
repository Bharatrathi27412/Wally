import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

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

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class AnalyticsN {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnalyticsN window = new AnalyticsN();
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
	public AnalyticsN() {
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
		
		JPanel sidebar = new JPanel();
		sidebar.setBounds(0, 0, 286, 708);
		sidebar.setBackground(new Color(54, 33, 89));
		JPanel panel = new JPanel();

		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		JPanel dashboardP = new JPanel();
		dashboardP.setBackground(new Color(54, 33, 89));
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
				dashboardBBB d1 = new dashboardBBB();
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
		
		JLabel ExpenseListL = new JLabel();
		Image img2 = new ImageIcon(this.getClass().getResource("/list.png")).getImage();
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
		AnalyticsP.setBackground(new Color(54, 33, 89));
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
		Image img4 = new ImageIcon(this.getClass().getResource("/dashlogo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img4));
		lblNewLabel.setBounds(10, 50, 266, 59);
		sidebar.add(lblNewLabel);
		
		JPanel main_page = new JPanel();
		main_page.setLayout(null);
		main_page.setBackground(Color.RED);
		main_page.setBounds(286, 0, 770, 708);
		frame.getContentPane().add(main_page);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"---Select One---", "Category Wise", "Month Wise", "Day Wise"}));
		String graph_type = comboBox.getSelectedItem().toString();
		comboBox.setBounds(67, 11, 157, 22);
		main_page.add(comboBox);
		
		JButton btnNewButton = new JButton("Show Chart\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().toString() == "Category Wise")
				{
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
						Statement stmt = con.createStatement();
						String sql = "select distinct(category_name) as Category, sum(amount) as Amount from expense_list group by category_name;";
						JDBCCategoryDataset dataset = new JDBCCategoryDataset(con,sql);
						
						con.close();
						JFreeChart chart = ChartFactory.createBarChart("Query Chart", "Category", "Amount", dataset, PlotOrientation.VERTICAL, false, true, true);
						BarRenderer renderer = null;
						CategoryPlot plot = null;
						renderer = new BarRenderer ();
						ChartFrame frame = new ChartFrame("Line Graph",chart);
						//frame.setVisible(true);
						//frame.setSize(400, 650);
						
						ChartPanel barpanel = new ChartPanel(chart);
						panel.removeAll();
						panel.add(barpanel,BorderLayout.CENTER);
						panel.validate();
						
						
						
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(null,e1);
					}
				}
				else if(comboBox.getSelectedItem().toString() == "Month Wise")
				{
					
				}
				else if(comboBox.getSelectedItem().toString() == "Day Wise") {
					
				}
			}
		});
		btnNewButton.setBounds(272, 11, 89, 23);
		main_page.add(btnNewButton);
		
		//JPanel panel = new JPanel();
		panel.setBounds(10, 64, 736, 616);
		main_page.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
	}
}
