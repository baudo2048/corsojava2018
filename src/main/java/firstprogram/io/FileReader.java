package firstprogram.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {
		File file1 = new File("C:\\Users\\Admin\\git\\corsojava2018\\fileDaLeggere.txt");
		File file2 = new File("C:\\Users\\Admin\\git\\corsojava2018\\fileDaLeggere2.txt");
		
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter(file2);
		
		String ss = "";
		boolean nl = scan.hasNextLine();
		int f = 0;
		while (nl && f==0) {
			ss= scan.nextLine();
			
			fw.append(ss + "\n");
			
			if ("fine".compareTo(ss)==0) {
				f++;
			}
		}
		
		fw.flush();
		fw.close();
		scan.close();
		System.out.println("fine");
	}

}
