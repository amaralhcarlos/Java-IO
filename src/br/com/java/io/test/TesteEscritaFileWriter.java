package br.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//OutputStream fos = new FileOutputStream("ispum.txt");
		//Writer osw = new OutputStreamWriter(fos);
		//BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("ipsumFileWriter.txt"));
		
		bw.write("Teste de escrita em arquivo");
		bw.newLine();
		bw.write("Criada uma nova linha de novo");
		
		bw.close();
	}
}
