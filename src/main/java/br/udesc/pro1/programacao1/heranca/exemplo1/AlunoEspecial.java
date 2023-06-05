/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.exemplo1;

/**
 *
 * @author mattheus
 */
public class AlunoEspecial extends Aluno {
    private String semestreMatriculado;
            
    public AlunoEspecial(String nome, String dataNascimento, String CPF, String matricula, String emailInstitucional, String semestreMatriculado) {
        super(nome, dataNascimento, CPF, matricula, emailInstitucional);
        
    }
    
}
