package com.gi.oop;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import static java.lang.Math.*;

public class EsempioLogger {
	public static void main(String[] args) {

		Logger log1 = Logger.getLogger("log");

		try {
			FileHandler handler = new FileHandler("c:\\log\\logFile.log", true);
			log1.setLevel(Level.ALL);
			log1.addHandler(handler);
			SimpleFormatter formato = new SimpleFormatter();
			handler.setFormatter(formato);
			System.out.println(new Date());
			int x = 10;
			double d = PI + random();
			log1.log(Level.WARNING, "Il valore di x: " + x);

		} catch (IOException exc) {

		}

	}

}
