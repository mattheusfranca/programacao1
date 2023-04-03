/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo3;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        String nome = "Marília";
        int anoIngresso = 2019;
        String matricula = "2019001";
                
        Aluno novoAluno = new Aluno(nome, anoIngresso);
        
        Aluno novoAluno2 = new Aluno("Mattheus", anoIngresso);
        
        String informacoes = novoAluno.obterInformacoesAluno();
        System.out.println(informacoes);
        
        informacoes = novoAluno2.obterInformacoesAluno();
        System.out.println(informacoes);
        
        System.out.println(Aluno.geradorMatricula);
     
        
        Aluno.getCursosDisponiveis();
        
        novoAluno.adicionarDuvida("Como declarar uma varuável?");
        novoAluno.adicionarDuvida("Para que serve a palavra this em Java?");
        novoAluno.adicionarDuvida("Como criar um construtor em Java?");
        
        novoAluno.imprimirDuvidas();
    }
}
