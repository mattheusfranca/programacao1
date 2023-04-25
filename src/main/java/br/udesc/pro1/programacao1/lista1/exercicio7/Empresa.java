/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.lista1.exercicio7;

import java.util.ArrayList;

/**
 *
 * @author mattheus
 */
public class Empresa {
    private String nome;
    private String CNPJ;
    private ArrayList<Departamento> departamentos;
    private final int TAM = 10;

    public Empresa(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        departamentos = new ArrayList();
    }
    
    public boolean adicionarDepartamento(Departamento departamento){
        if(departamentos.size() == 10)
            return false;
        departamentos.add(departamento);
        return true;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nome=" + nome + ", CNPJ=" + CNPJ + ", departamentos=" + departamentos + '}';
    }
    
    
}
