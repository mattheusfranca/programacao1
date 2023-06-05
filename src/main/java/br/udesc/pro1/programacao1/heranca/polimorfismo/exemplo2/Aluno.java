/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.polimorfismo.exemplo2;

/**
 *
 * @author mattheus
 */
public class Aluno extends Pessoa {
    
    @Override
    public String toString(){
        return "é um aluno";
    }
    
    
    public int getMatricula(){
        return 10;
    }
}
