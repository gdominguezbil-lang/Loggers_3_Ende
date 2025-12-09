package Loggers3;

import java.util.logging.*;
import java.io.*;

public class MainWConfig {
	private static Logger logger;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		LogManager.getLogManager().readConfiguration(new FileInputStream("./config/logging.properties"));
		logger = Logger.getLogger(MainWConfig.class.getName());
		logger.log(Level.INFO, "La aplicación ha iniciado correctamente.");
		
		Calculator calc = new Calculator();

		
		int a = 3;
		int b = 99;
		
		double r1 = calc.add(a, a);
		logger.log(Level.INFO, "se calcula la suma de " + a + " y " + a);

		double r2 = calc.sub(b, a);
		logger.log(Level.INFO, "se calcula la resta de " + b + " y " + a);

		double r3 = calc.mul(a, a);
		logger.log(Level.INFO, "se calcula la multiplicacion de " + a + " y " + a);

		try {
			double r4 = calc.div(r3, r2);
			System.out.println("r1: " + r1 + "\nr2: " + r2 + "\nr3: " + r3 + "\nr4: " + r4);
		} catch (ArithmeticException e) {
		}
	}
}
