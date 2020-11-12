package br.com.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaViaTeclado {

	public static void main(String[] args) throws IOException {

		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		OutputStream fos = new FileOutputStream("viaTeclado.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String line = br.readLine();

		while (!line.isEmpty()) {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}

		bw.close();
		br.close();

	}

}
