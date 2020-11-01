package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com Arquivo

		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		br.lines().forEach(line -> {
			System.out.println(line);
		});

		br.close();
	}
}