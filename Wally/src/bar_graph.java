import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class bar_graph {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bar_graph window = new bar_graph();
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
	public bar_graph() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Query");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bar","root","12345678");
					Statement stmt = con.createStatement();
					String sql = "select mobile_brand,unit_sale from mobile_tbl";
					JDBCCategoryDataset dataset = new JDBCCategoryDataset(con,sql);
					
					con.close();
					JFreeChart chart = ChartFactory.createBarChart("Query Chart", "Mobile", "Units", dataset, PlotOrientation.VERTICAL, false, true, true);
					BarRenderer renderer = null;
					CategoryPlot plot = null;
					renderer = new BarRenderer ();
					ChartFrame frame = new ChartFrame("Line Graph",chart);
					frame.setVisible(true);
					frame.setSize(400, 650);
					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnNewButton.setBounds(161, 165, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
