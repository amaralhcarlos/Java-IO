package br.com.java.io.entities;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Nico Steppat
 * @version 0.1
 */

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    // SerialVersionUID serve para administrar a versão da classe.

    private String nome;
    private String cpf;
    //private transient String cpf;
    //Caso você não deseje serializar algum atributo em específico de determinado objeto,
    // basta marcá-lo como transient, assim o objeto serializado não conterá a informação referente ao atributo transient.
    private String profissao;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
