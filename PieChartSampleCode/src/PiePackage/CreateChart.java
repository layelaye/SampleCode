
package PiePackage;
// import appropriate Classes and packages
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author NdongoLahi
 */
public class CreateChart extends JFrame {
    
    // constructor that take 2 strings parameters
    public CreateChart(String appTitle, String chartTitle) {
        
        PieDataset dataset = createDataset(); // an instance of PieDataset from jcommon-1.0.23.jar
        JFreeChart chart = createChart(dataset , chartTitle);// an instance of JFreeChart with dataset and chartTitle param
        ChartPanel chartPanel = new ChartPanel(chart); // an instance of chart ChartPanel that take a JFreeChart
        chartPanel.setPreferredSize(new java.awt.Dimension(520, 320)); //call the set PreferredSize method 
        setContentPane(chartPanel); // setContentPane with ChartPanel as a param
    }
    
    // createDataset function that return a PieDataset
    private PieDataset createDataset(){  
        
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Android", 48.61);
        result.setValue("iOS/OS X", 11.04);
        result.setValue("Windows", 14.0);
        result.setValue("Others", 26.34);
        return result;
    }
    
    // function that take a PieDataset and a String then return a JFreeChart
    private JFreeChart createChart(PieDataset dataset, String title){ 
        
        JFreeChart jfChart = ChartFactory.createPieChart3D(title, dataset, true, true, true);
        PiePlot3D plot = (PiePlot3D) jfChart.getPlot();
        plot.setStartAngle(190);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.65f);
        return jfChart;
    }
    
}
