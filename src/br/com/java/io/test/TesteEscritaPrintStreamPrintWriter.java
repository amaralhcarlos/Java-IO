package br.com.java.io.test;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

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
