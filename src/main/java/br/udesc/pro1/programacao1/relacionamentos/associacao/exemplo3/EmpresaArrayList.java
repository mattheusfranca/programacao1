/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.relacionamentos.associacao.exemplo3;

import java.util.ArrayList;


/**
 *
 * @author mattheus
 */
public class EmpresaArrayList {
    private String nome;
    private ArrayList<Funcionario> funcionarios;
                
    public EmpresaArrayList(String nome){
        this.nome = nome;
        this.funcionarios = new ArrayList();
    }
    
    public boolean contratar(Funcionario funcionario){
        return funcionarios.add(funcionario);
    }
    
    public void imprimirFuncionarios(){
        for(Funcionario f: funcionarios){
            System.out.println(f);
        }
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    
}

