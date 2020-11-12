package br.com.java.io.test;

import br.com.java.io.entities.Cliente;

import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente("Carlos Amaral", "444.444.444.44", "Analista de TI");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

        Cliente novoCliente;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        novoCliente = (Cliente) ois.readObject();

        System.out.println(novoCliente.toString());

    }

}
