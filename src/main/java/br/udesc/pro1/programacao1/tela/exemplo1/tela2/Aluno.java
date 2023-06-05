/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.tela.exemplo1.tela2;

/**
 *
 * @author mattheus
 */
public class Aluno {
    private String matricula;
    private String nome;
    private boolean ativo;

    public Aluno(String matricula, String nome, boolean ativo) {
        this.matricula = matricula;
        this.nome = nome;
        this.ativo = ativo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", ativo=" + ativo + '}';
    }
    
    
    
    
}
