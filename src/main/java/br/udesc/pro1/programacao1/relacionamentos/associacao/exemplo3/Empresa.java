/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.relacionamentos.associacao.exemplo3;

/**
 *
 * @author mattheus
 */
public class Empresa {
    private String nome;
    private Funcionario[] funcionarios;
    
    final private int MAX = 3;
            
    private int contadorFuncionarios;
    
    public Empresa(String nome){
        this.nome = nome;
        this.funcionarios = new Funcionario[MAX];
        contadorFuncionarios = 0;
    }
    
    public boolean contratar(Funcionario funcionario){
        if(contadorFuncionarios < MAX){
            funcionarios[contadorFuncionarios++] = funcionario;
            return true;
        }
        else 
            return false;
    }
    
    public void imprimirFuncionarios(){
        for(int i=0; i<MAX; i++){
            System.out.println(funcionarios[i]);
        }
    }
    
    public Funcionario[] getFuncionarios(){
        return funcionarios;
    }
    
}
