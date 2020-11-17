import java.awt.EventQueue;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class practice_graphs {

	protected static final boolean True = false;
	protected static final float TOP_ALIGNMENT = 0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practice_graphs window = new practice_graphs();
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
	public practice_graphs() {
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
		
		JButton btnNewButton = new JButton("Pie Chart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultPieDataset pieDataset = new DefaultPieDataset();
				pieDataset.setValue("One",new Integer(1));
				pieDataset.setValue("Two",new Int(20));
				pieDataset.setValue("Three",new Integer(30));
				pieDataset.setValue("Four",new Integer(40));
				JFreeChart chart1 = ChartFactory.createPieChart("Pie_chart", pieDataset, True, True, True);
				PiePlot p = (PiePlot)chart1.getPlot();
				//p.setForegroundAlpha(TOP_ALIGNMENT);
				
				ChartFrame frame = new ChartFrame("Pie Chart",chart1);
				frame.setVisible(True);
				frame.setSize(450,500);
			}
		});
		btnNewButton.setBounds(159, 204, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
