/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.relacionamentos.associacao.exemplo3;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Empresa empresaPro1 = new Empresa("PRO1");
        
        Funcionario funcionario1 = new Funcionario("Maria Eduarda", "ES", 10000);
        Funcionario funcionario2 = new Funcionario("Lucas", "ES", 10000);
        Funcionario funcionario3 = new Funcionario("Isaac", "ES", 10000);
        Funcionario funcionario4 = new Funcionario("Carla", "ES", 10000);
        
        empresaPro1.contratar(funcionario1);
        empresaPro1.contratar(funcionario2);
        empresaPro1.contratar(funcionario3);
        empresaPro1.contratar(funcionario4);
        
        empresaPro1.imprimirFuncionarios();
        
        
        Funcionario[] funcionarios = empresaPro1.getFuncionarios();
        
    }
}
