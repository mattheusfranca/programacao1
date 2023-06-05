/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.exemplo1;

import java.util.ArrayList;

/**
 *
 * @author mattheus
 */
public class Professor extends Pessoa {
    private String dataAdmissao;
    private ArrayList<String> disciplinas;

    public Professor(String nome, String dataNascimento, String CPF, String dataAdmissao) {
        super(nome, dataNascimento, CPF);
        this.dataAdmissao = dataAdmissao;
        disciplinas = new ArrayList();
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    
}
