package firstprogram.esercizi.esercizio3;
import java.io.File;
import java.util.LinkedList;

public class Esercizio3 {
	public static void main(String[] args) {
		
		LinkedList<File> stack = new LinkedList<File>();
		
		int nDir = 0;
		int nFil = 0;
		
		String initialDir = "C:\\Users\\Admin\\Documents\\Altova\\XMLSpy2018\\Documentation\\JSONSchema";
		stack.push(new File(initialDir));
		
		while(!stack.isEmpty()) {
			File f = stack.pop(); nDir++;
			String[] l = f.list();
			for (String s : l) {
				File ff = new File(f.getAbsolutePath() + "\\" + s);
				if( (ff.isDirectory())) {
					stack.push(ff);
				} else {
					nFil++;
				}
			}
		}
		
		System.out.println(nDir + " " + nFil);
	}
}
