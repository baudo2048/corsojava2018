package firstprogram.Esercizio2;

import org.apache.commons.lang3.StringUtils;

public class Esercizio2_StringUtils {

	public static void main(String[] args) {
		String str = "((dd)";
		
		if (StringUtils.countMatches(str, '(') == StringUtils.countMatches(str, ')')) {
			System.out.println("vero");
		} else {
			System.out.println("falso");
		}

	}

}
