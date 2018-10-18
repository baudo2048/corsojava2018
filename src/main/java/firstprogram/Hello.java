package firstprogram;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import firstprogram.math.Polygon;
import firstprogram.math.Rectangle;
import firstprogram.math.Square;
import firstprogram.sample.TestPoli1;

/**
 * Questa classe rappresenta bla bla bla
 * @author giuseppe
 *
 */
public class Hello {
	
	/**
	 * Questo metodo rappresenta bla bla bla
	 * @param args - passati da riga di comando
	 * @since 1.7
	 */
	public static void main(String[] args) {
		System.out.println("hello eclipse");
		
		TestPoli1 tp1 = new TestPoli1();
		
		Polygon p0 = new Polygon();
		Polygon p1 = new Rectangle();
		Polygon p2 = new Square();
		
		tp1.setP(p2);
		tp1.esegui();
		
	
	}
	
	private void samplePdf() {
		PDDocument doc = new PDDocument();
		
		PDPage page = new PDPage();

	}

}
