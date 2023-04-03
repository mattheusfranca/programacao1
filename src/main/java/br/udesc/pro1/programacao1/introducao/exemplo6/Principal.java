/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.introducao.exemplo6;

/**
 * Exemplo demonstrando uso de métodos privados
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Nome do Aluno");
        
        aluno.getResultado();
        
        aluno.setNotaP1(8);
        aluno.setNotaP2(9);
        aluno.setNotaTrabalho(9.5f);
        aluno.getResultado();
    }
}
