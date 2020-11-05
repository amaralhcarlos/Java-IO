package br.com.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCsv {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {

			String line = scanner.nextLine();
			
			Scanner lineScanner = new Scanner(line);

			lineScanner.useLocale(Locale.US);
			lineScanner.useDelimiter(",");

			String tipoConta = lineScanner.next();
			int agencia = lineScanner.nextInt();
			int conta = lineScanner.nextInt();
			String titular = lineScanner.next();
			double saldo = lineScanner.nextDouble();
			
			String formatted = String.format(Locale.getDefault(),"%s - %04d-%08d, %s: - R$%05.2f", tipoConta, agencia, conta, titular, saldo);
			
			System.out.println(formatted);
			
			lineScanner.close();

		}

		scanner.close();
	}

}
