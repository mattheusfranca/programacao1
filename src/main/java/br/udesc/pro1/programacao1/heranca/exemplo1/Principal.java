/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.exemplo1;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joaquim", "15/05/1888", "1");
        pessoa.getNome();
        
        Aluno aluno = new Aluno("Aluno 1", "01/01/2010", "2", "3", "email@aluno.com");
        aluno.getNome();
        aluno.getMatricula();
       
        System.out.println(pessoa);
        
        
                
    }
}
