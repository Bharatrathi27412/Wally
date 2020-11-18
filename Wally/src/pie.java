import java.awt.EventQueue;

import javax.swing.JFrame;

import com.mysql.cj.xdevapi.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class pie {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pie window = new pie();
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
	public pie() {
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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mobilebrands[] = {
				         "IPhone 5s",   
				         "SamSung Grand",   
				         "MotoG",            
				         "Nokia Lumia" 
				      };
				      
				      /* Create MySQL Database Connection */
				      Class.forName( "com.mysql.jdbc.Driver" );
				      Connection connect = DriverManager.getConnection( 
				         "jdbc:mysql://localhost:3306/wally" ,     
				         "root",     
				         "12345678");
				      
				      Statement statement = (Statement) connect.createStatement( );
				      ResultSet resultSet = statement.executeQuery("select * from mobile_data" );
				      DefaultPieDataset dataset = new DefaultPieDataset( );
				      
				      while( resultSet.next( ) ) {
				         dataset.setValue( 
				         resultSet.getString( "mobile_brand" ) ,
				         Double.parseDouble( resultSet.getString( "unit_sale" )));
				      }
				      
				      JFreeChart chart = ChartFactory.createPieChart(
				         "Mobile Sales",   // chart title           
				         dataset,          // data           
				         true,             // include legend          
				         true,           
				         false );

				      int width = 560;    /* Width of the image */
				      int height = 370;   /* Height of the image */ 
				      File pieChart = new File( "Pie_Chart.jpeg" );
				      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
			}
		});
		btnNewButton.setBounds(165, 129, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
