
package PiePackage;

import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author NdongoLahi
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        CreateChart createChart = new CreateChart("Pie Chart Result", "Worldwide Device Shipments by OS");
        createChart.pack();
        createChart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createChart.setVisible(true);
        
    }
}
