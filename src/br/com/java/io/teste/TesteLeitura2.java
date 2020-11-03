package br.com.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("contas.csv"));

		String line = scanner.nextLine();

		System.out.println(line);

		while (scanner.hasNextLine()) {
			// String[] valores = line.split(",");
			// System.out.println(Arrays.toString(valores));

			Scanner lineScanner = new Scanner(line);

			lineScanner.useLocale(Locale.US);
			lineScanner.useDelimiter(",");

			String valor1 = lineScanner.next();
			int valor2 = lineScanner.nextInt();
			int valor3 = lineScanner.nextInt();
			String valor4 = lineScanner.next();
			double valor5 = lineScanner.nextDouble();
			
			System.out.println(valor1);
			System.out.println(valor2);
			System.out.println(valor3);
			System.out.println(valor4);
			System.out.println(valor5);
			
			lineScanner.close();

			line = scanner.nextLine();
			System.out.println(line);

		}

		scanner.close();
	}

}
