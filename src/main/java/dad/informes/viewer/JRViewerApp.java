package dad.informes.viewer;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import dad.informes.agenda.AgendaDataProvider;
import dad.informes.agenda.Main;
import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;

public class JRViewerApp extends Application {
	
	public static final String JRXML_FILE = "/reports/agenda.jrxml";

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		JasperReport report = JasperCompileManager.compileReport(Main.class.getResourceAsStream(JRXML_FILE));		
        JasperPrint print  = JasperFillManager.fillReport(report, parameters, new JRBeanCollectionDataSource(AgendaDataProvider.getPersonas()));
		JRViewer viewer = new JRViewer(print);

		SwingNode swingNode = new SwingNode();
		swingNode.setContent(viewer);
		
		Button button = new Button("Refrescar");
		button.setOnAction(e -> viewer.repaint());

		BorderPane root = new BorderPane();
		root.setCenter(swingNode);
		root.setBottom(button);
		
		primaryStage.setTitle("JRViewer embebido en JavaFX");
		primaryStage.setScene(new Scene(root, 640, 480));
		primaryStage.show();

		new Timer().schedule(new TimerTask() {
			public void run() {
				viewer.repaint();
			}
		}, 500L);

	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
