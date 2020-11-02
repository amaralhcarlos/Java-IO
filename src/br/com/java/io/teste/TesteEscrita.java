package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream fos = new FileOutputStream("ispum.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Teste de escrita em arquivo");
		bw.newLine();
		bw.write("Criei uma nova linha");
		
		
		bw.close();
		
	}

}
