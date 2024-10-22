import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import com.toedter.calendar.JDateChooser;

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
		frame.setLocationRelativeTo(null);
		
		JComboBox comboBox_1 = new JComboBox();
		JPanel panel = new JPanel();

		
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
                //dashboardP.setBackground(new Color(41,57,80));
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
		AnalyticsP.setBackground(new Color(41, 57, 80));
		
		JPanel AnalyticsC = new JPanel();
		AnalyticsC.setOpaque(true);
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
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				AnalyticsP.setBackground(new Color(41,57,80));


			}
			@Override
			public void mouseExited(MouseEvent e) {
              //  AnalyticsP.setBackground(new Color(18,18,18));

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
		JPanel panel = new JPanel();

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
		dateChooser.setBounds(268, 15, 109, 20);
		main_page.add(dateChooser);
		comboBox_1.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(404, 21, 86, 14);
		main_page.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(177, 21, 86, 14);
		main_page.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem().toString() == "Month Wise")
				{
					dateChooser.setDateFormatString("yyyy-MM-__");
					dateChooser.setVisible(true);
					comboBox_1.setVisible(false);
					lblNewLabel_2.setText("");
					lblNewLabel_1.setText("Select Month");
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--Select One--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
				}
				else if(comboBox.getSelectedItem().toString() == "Day Wise")
				{
					dateChooser.setDateFormatString("yyyy-MM-dd");
					dateChooser.setVisible(true);
					lblNewLabel_1.setText("Select Date");
					lblNewLabel_2.setText("");
					comboBox_1.setVisible(false);
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--Select One--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12","13","14","15","16","17","18","19","20"
					,"21","22","23","24","25","26","27","28","29","30","31"}));
				}
				else if(comboBox.getSelectedItem().toString() == "Year Wise") {
					dateChooser.setVisible(false);
					lblNewLabel_1.setText("");
					lblNewLabel_2.setText("Select Year");
					comboBox_1.setVisible(true);
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--Select One--","2006", "2007", "2008", "2009", "2010", "2011", "2012","2013","2014","2015","2016","2017","2018","2019","2020"
					,"2021","2022","2023","2024","2025"}));
				}
				else if(comboBox.getSelectedItem().toString() == "Category Wise") {
					dateChooser.setVisible(false);
					comboBox_1.setVisible(false);
					lblNewLabel_1.setText("");
					lblNewLabel_2.setText("");
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"---Select One---", "Category Wise", "Month Wise", "Day Wise","Year Wise"}));
		String graph_type = comboBox.getSelectedItem().toString();
		comboBox.setBounds(10, 15, 157, 22);
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
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
						Statement stmt = con.createStatement();
						String sql = "select distinct(category_name) as Category, sum(amount) as Amount from expense_list where exp_date like '"+((JTextField)dateChooser.getDateEditor().getUiComponent()).getText()+"' group by category_name;";
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
				else if(comboBox.getSelectedItem().toString() == "Day Wise") {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
						Statement stmt = con.createStatement();
						String sql = "select distinct(category_name) as Category, sum(amount) as Amount from expense_list where exp_date like '"+((JTextField)dateChooser.getDateEditor().getUiComponent()).getText()+"' group by category_name;";
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
				else if(comboBox.getSelectedItem().toString() == "Year Wise") {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
						Statement stmt = con.createStatement();
						String sql = "select distinct(category_name) as Category, sum(amount) as Amount from expense_list where exp_date like '"+comboBox_1.getSelectedItem().toString()+"-__-__' group by category_name;";
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
				
			}
		});
		btnNewButton.setBounds(609, 15, 114, 23);
		main_page.add(btnNewButton);
		
		//JPanel panel = new JPanel();
		panel.setBounds(10, 64, 736, 616);
		main_page.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
	
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--Please select--"}));
		comboBox_1.setBounds(484, 15, 102, 22);
		main_page.add(comboBox_1);
		
	}
}
