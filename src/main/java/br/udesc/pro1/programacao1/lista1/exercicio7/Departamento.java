/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio7;

/**
 *
 * @author mattheus
 */
public class Departamento {
    private String nome;
    private Funcionario[] funcionarios;
    private final int TAM = 100;
    private int contFunc;

    public Departamento(String nome) {
        this.nome = nome;
        funcionarios = new Funcionario[TAM];
        contFunc = 0;
    }

    public boolean adicionarProfessor(Funcionario funcionario){
        if(contFunc == TAM)
            return false;
        funcionarios[contFunc] = funcionario;
        contFunc++;
        return true;
    }
    
    public void reajusteSalarioFuncionarios(float percentrual){
        for(int i=0; i<contFunc;i++){
            float salarioAtual = funcionarios[i].getSalario();
            funcionarios[i].setSalario((salarioAtual * percentrual / 100) + salarioAtual);
        }
    }
    
    @Override
    public String toString() {
        String funcString = "";
        for(int i=0; i<contFunc; i++){
            funcString += funcionarios[i] + "\n";
        }
        return "Departamento{" + "nome=" + nome + ", funcionarios=" + funcString + '}';
    }
    
}
