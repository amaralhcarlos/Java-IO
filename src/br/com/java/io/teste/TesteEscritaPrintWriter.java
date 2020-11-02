package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {

		PrintStream ps = new PrintStream("ipsumPrintStream.txt");
		
		ps.println("Teste de escrita com PrintStream");
		ps.println();
		ps.println("Criada uma nova linha de novo");
		
		ps.close();
		
		PrintWriter pw = new PrintWriter("ipsumPrintWriter.txt");
		
		pw.println("Teste de escrita com PrintWriter");
		pw.println();
		pw.print("Fim do teste");
		
		pw.close();
	}
}
