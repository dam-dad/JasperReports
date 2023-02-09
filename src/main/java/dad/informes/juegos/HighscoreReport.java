package dad.informes.juegos;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dad.informes.agenda.AgendaDataProvider;
import dad.informes.agenda.Main;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class HighscoreReport {
	
	public static void vistaPrevia() throws JRException {
		
		// compila el informe
		JasperReport report = JasperCompileManager.compileReport(Main.class.getResourceAsStream("/reports/highscore.jrxml"));		

		// mapa de parámetros para el informe
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("autor", "Francisco Vargas Ruiz");

		// creamos la lista de puntuaciones
		List<Puntuacion> puntuaciones = new ArrayList<>();
		puntuaciones.add(new Puntuacion("Martín", 10));
		puntuaciones.add(new Puntuacion("Ana", 8));
		puntuaciones.add(new Puntuacion("Alejandro", 5));
		puntuaciones.add(new Puntuacion("Yo", 1));
		
		// generamos el informe (combinamos el informe compilado con los datos) 
        JasperPrint print  = JasperFillManager.fillReport(report, parameters, new JRBeanCollectionDataSource(puntuaciones));
        
        // visualiza el informe generado
        JasperViewer.viewReport(print);
        
	}
	
	public static void generarPdf() throws JRException, IOException {

		// compila el informe
		JasperReport report = JasperCompileManager.compileReport(Main.class.getResourceAsStream("/reports/highscore.jrxml"));		

		// mapa de parámetros para el informe
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("autor", "Francisco Vargas Ruiz");
		
		// creamos la lista de puntuaciones
		List<Puntuacion> puntuaciones = new ArrayList<>();
		puntuaciones.add(new Puntuacion("Martín", 10));
		puntuaciones.add(new Puntuacion("Ana", 8));
		puntuaciones.add(new Puntuacion("Alejandro", 5));
		puntuaciones.add(new Puntuacion("Yo", 1));
		
		// generamos el informe (combinamos el informe compilado con los datos) 
        JasperPrint print  = JasperFillManager.fillReport(report, parameters, new JRBeanCollectionDataSource(puntuaciones));
        
        // exporta el informe a un fichero PDF
        JasperExportManager.exportReportToPdfFile(print, "pdf/highscore.pdf");
        
        // Abre el archivo PDF generado con el programa predeterminado del sistema
		Desktop.getDesktop().open(new File("pdf/highscore.pdf"));
	}

	public static void main(String[] args) throws JRException, IOException {

//		generarPdf();
		vistaPrevia();
		
	}

}
