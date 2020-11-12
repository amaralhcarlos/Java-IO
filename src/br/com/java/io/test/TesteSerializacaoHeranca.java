package br.com.java.io.test;

import br.com.java.io.entities.Cliente;
import br.com.java.io.entities.ContaCorrente;

import java.io.*;

public class TesteSerializacaoHeranca {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente("Carlos Amaral", "444.444.444.44", "Analista de TI");

        ContaCorrente cc = new ContaCorrente(111, 25555);
        cc.setTitular(cliente);
        cc.deposita(200);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

        ContaCorrente novaConta;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        novaConta = (ContaCorrente) ois.readObject();

        System.out.println(cc.toString());
        System.out.println(cc.getTitular().toString());

    }
}
