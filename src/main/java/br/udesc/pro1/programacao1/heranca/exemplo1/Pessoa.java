/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.exemplo1;

/**
 *
 * @author mattheus
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String CPF;

    public Pessoa(String nome, String dataNascimento, String CPF) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Pessoa{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", CPF=" + CPF + '}';
    }
    
    
    
    
    
}
