/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio7;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Empresa udesc = new Empresa("UDESC", "123132");
        Departamento eso = new Departamento("Engenharia de Software");
        Departamento contabeis = new Departamento("Contábeis");

        udesc.adicionarDepartamento(eso);
        udesc.adicionarDepartamento(contabeis);
        
        System.out.println(udesc);
        
        Funcionario professor1 = new Funcionario("Professor 1", 10000, "01/01/2019");
        Funcionario professor2 = new Funcionario("Professor 2", 1000, "01/01/2019");
        
        eso.adicionarProfessor(professor1);
        eso.adicionarProfessor(professor2);
        
        System.out.println(udesc);
        
        eso.reajusteSalarioFuncionarios(25);
        
        System.out.println(udesc);
    }
}
